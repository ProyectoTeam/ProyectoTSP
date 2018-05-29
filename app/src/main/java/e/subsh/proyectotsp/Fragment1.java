package e.subsh.proyectotsp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    ArrayList<Cuestionario> cuestionarios;
    RecyclerView listaCuestionario;
    Button btnActualizar;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment2,container,false);

        btnActualizar = v.findViewById(R.id.btnActualizar);
        listaCuestionario = v.findViewById(R.id.rcvListaAlbums);
        LinearLayoutManager ilm = new LinearLayoutManager(getActivity());
        ilm.setOrientation(LinearLayoutManager.VERTICAL);
        listaCuestionario.setLayoutManager(ilm);
        InicializarListaAlbums();
        IniciarAdaptador();

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.detach(Fragment1.this).attach(Fragment1.this).commit();
            }
        });
        return v;
   }

    private void InicializarListaAlbums() {

        GestorCuestionario gestorcuestionario = new GestorCuestionario(this.getActivity());
        cuestionarios = gestorcuestionario.AsignarCuestionario();
    }




    private  void  IniciarAdaptador(){
        CuestionarioAdaptador miAdaptador = new CuestionarioAdaptador(cuestionarios);
        listaCuestionario.setAdapter(miAdaptador);
    }



}
