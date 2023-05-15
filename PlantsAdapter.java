package com.example.myapplication3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PlantsAdapter extends RecyclerView.Adapter<PlantsAdapter.ViewHolder> {

    private final List<Plants> plants;
    private final LayoutInflater inflater;

    public PlantsAdapter(List<Plants> plants, Context context) {
        this.plants = plants;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public PlantsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantsAdapter.ViewHolder holder, int position) {
        Plants plants1 = plants.get(position);
        holder.plantsView.setImageResource(plants1.getPlantsRes());
        holder.nameView.setText(plants1.getName());
        holder.plantsDesView.setText(plants1.getPlantsDescription());

    }

    @Override
    public int getItemCount() {
        return plants.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView plantsView;
        final TextView nameView, plantsDesView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            plantsView = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.name);
            plantsDesView = itemView.findViewById(R.id.desc);
        }
    }
}
