package com.example.piwo;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Integer> dataSet;
    private List<String> dataSetnames;

    public Adapter(List<Integer> dataSet, List<String> dataSetnames) {
        this.dataSet = dataSet;
        this.dataSetnames = dataSetnames;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageEl;
        TextView textEl;

        public ViewHolder(View view) {
            super(view);

            imageEl = view.findViewById(R.id.beerImage);
            textEl = view.findViewById(R.id.beerName);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.imageEl.setImageResource(dataSet.get(position));
        viewHolder.textEl.setText(dataSetnames.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    // Metoda do dodawania nowego elementu do RecyclerView
    public void addElement(int imageResource, String name) {
        dataSet.add(imageResource);
        dataSetnames.add(name);
        notifyItemInserted(dataSet.size() - 1);
    }
}
