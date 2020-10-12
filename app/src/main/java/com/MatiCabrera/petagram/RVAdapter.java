package com.MatiCabrera.petagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class  RVAdapter extends RecyclerView.Adapter<RVAdapter.MascotaViewHolder> {

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView Nombre;
        TextView Rating;
        ImageView ImgFoto;

        MascotaViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            Nombre = (TextView)itemView.findViewById(R.id.tvNombreCV);
            Rating = (TextView)itemView.findViewById(R.id.tvRatingCV);
            ImgFoto = (ImageView)itemView.findViewById(R.id.imgFoto);
        }
    }

    List<Mascotas> mascotas;

    RVAdapter(List<Mascotas> mascotas){
        this.mascotas = mascotas;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mascota, viewGroup, false);
        MascotaViewHolder pvh = new MascotaViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int i) {
        mascotaViewHolder.Nombre.setText(mascotas.get(i).nombre);
        mascotaViewHolder.Rating.setText(mascotas.get(i).rating);
        mascotaViewHolder.ImgFoto.setImageResource(mascotas.get(i).imageFoto);
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }
}

