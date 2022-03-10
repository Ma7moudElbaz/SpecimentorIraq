package com.cat.specimentoriraq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;


public class Read_more_adapter extends RecyclerView.Adapter<Read_more_adapter.ViewHolder> {

    private final List<Read_more_item> items;

    private final Context mContext;

    public Read_more_adapter(Context context, ArrayList<Read_more_item> items) {
        this.mContext = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Read_more_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_read_more, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Read_more_adapter.ViewHolder holder, final int position) {
        holder.image.setImageResource(items.get(position).getImageDrawable());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img);
        }
    }
}