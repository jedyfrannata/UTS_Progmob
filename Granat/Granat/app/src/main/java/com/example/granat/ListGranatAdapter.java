package com.example.granat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListGranatAdapter extends RecyclerView.Adapter<ListGranatAdapter.ListviewHolder> {
    private ArrayList<Granat> listGranat;

    public ListGranatAdapter(ArrayList<Granat> list) {
        this.listGranat = list;
    }
    @NonNull
    @Override
    public ListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_granat, parent, false);
        return new ListviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewHolder holder, int position) {
        Granat granat = listGranat.get(position);
        Glide.with(holder.itemView.getContext())
                .load(granat.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvNama.setText(granat.getNama());
        holder.tvDetail.setText(granat.getDetail());

    }

    @Override
    public int getItemCount() {
        return listGranat.size();
    }

    class ListviewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;

        ListviewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_granat);
            tvNama = itemview.findViewById(R.id.tv_item_nama);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}

