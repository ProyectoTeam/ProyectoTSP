package e.subsh.proyectotsp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CuestionarioAdaptador extends RecyclerView.Adapter<CuestionarioAdaptador.CuestionarioViewHolder> {

    private ArrayList<Cuestionario> cuestionarios;

    public CuestionarioAdaptador(ArrayList<Cuestionario> cuestionarios) {
        this.cuestionarios = cuestionarios;
    }

    @NonNull
    @Override
    public CuestionarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_cuestionario,parent,false);
        return new CuestionarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CuestionarioAdaptador.CuestionarioViewHolder holder, int position) {
        final Cuestionario cuestionario = cuestionarios.get(position);
        holder.txtvNombre.setText(cuestionario.getNombre());
        holder.txtvPregunta.setText(cuestionario.getPregunta());
        holder.txtvRespuesta.setText(cuestionario.getRespuesta());



    }

    @Override
    public int getItemCount() {
        return cuestionarios.size();
    }

    public static class CuestionarioViewHolder extends RecyclerView.ViewHolder {


        private TextView txtvRespuesta;
        private TextView txtvNombre;
        private TextView txtvPregunta;

        public CuestionarioViewHolder(View itemView) {
            super(itemView);
            // imgAlbum = itemView.findViewById(R.id.imgFoto); estoy en esto
            //txtvPregunta = itemView.findViewById(R.id.txtvPregunta);
           // txtvRespuesta = itemView.findViewById(R.id.);
           // txtvNombre=itemView.findViewById(R.id.txtvNombreArtista);
        }
    }

}
