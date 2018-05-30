package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class Ejemplos extends AppCompatActivity {

    ExpandableListAdapter madapter;
    ExpandableListView explstAprender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos);
        explstAprender = findViewById(R.id.explst_Temas);
        madapter = new MyExpandableListAdapter();
        explstAprender.setAdapter(madapter);

        explstAprender.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Intent intentdatos= new Intent(Ejemplos.this,ejemplo_tipo_1.class);
                intentdatos.putExtra(getResources().getString(R.string.var_extra_temarioEjemplo),String.valueOf(groupPosition) + String.valueOf(childPosition));
                startActivity(intentdatos);
                return false;
            }
        });


    }

    public class MyExpandableListAdapter extends BaseExpandableListAdapter{

        // Sample data set. children[i] contains the children (String[]) for
        // groups[i].
        private String[] groups = { "Números Naturales", "Suma y resta de números naturales",
                "Multiplicación de números naturales", "División de números naturales", "Las fracciones" };
        private String[][] children = { { "Sistema de numeración", "Lectura y escritura de números", "Comparación y ordenación de números" },
                { "La suma", "La resta", "Operaciones con paréntesis" }, { "Multiplicación", "Propiedades", "Operaciones combinadas" },
                { "La división", "Tipo de divisiones", "Propiedades de la división exacta" }, { "Las fracciones y sus partes", "Lectura y escritura", "Operaciones con fracciones" } };

        public Object getChild(int groupPosition, int childPosition) {
            return children[groupPosition][childPosition];
        }

        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        public int getChildrenCount(int groupPosition) {
            int i = 0;
            try {
                i = children[groupPosition].length;

            } catch (Exception e) {
            }

            return i;
        }

        public TextView getGenericView() {
            // Layout parameters for the ExpandableListView
            AbsListView.LayoutParams lp = new AbsListView.LayoutParams(
                    ViewGroup.LayoutParams.FILL_PARENT, 120);

            TextView textView = new TextView(Ejemplos.this);
            textView.setLayoutParams(lp);
            // Center the text vertically
            textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
            textView.setTextSize(20);
            textView.setTextColor(getResources().getColor(R.color.colorText));
            // Set the text starting position
            textView.setPadding(60, 0, 0, 0);
            return textView;
        }

        public View getChildView(int groupPosition, int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            TextView textView = getGenericView();
            textView.setText(getChild(groupPosition, childPosition).toString());
            return textView;
        }

        public Object getGroup(int groupPosition) {
            return groups[groupPosition];
        }

        public int getGroupCount() {
            return groups.length;
        }

        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            TextView textView = getGenericView();
            textView.setText(getGroup(groupPosition).toString());
            return textView;
        }

        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }

        public boolean hasStableIds() {
            return true;
        }
    }


}
