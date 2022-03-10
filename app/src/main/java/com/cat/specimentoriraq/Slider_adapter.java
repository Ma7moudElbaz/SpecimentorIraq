package com.cat.specimentoriraq;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.github.islamkhsh.CardSliderAdapter;

import java.util.ArrayList;

public class Slider_adapter extends CardSliderAdapter<Slider_adapter.MViewHolder> {

    private final Context mContext;
    private final ArrayList<Slider_item> items;
    private final int sectionNo;

    public Slider_adapter(Context mContext, ArrayList<Slider_item> items, int sectionNo) {
        this.mContext = mContext;
        this.items = items;
        this.sectionNo = sectionNo;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public MViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slider, parent, false);
        return new MViewHolder(view);
    }


    @Override
    public void bindVH(MViewHolder holder, int position) {
        holder.image.setImageResource(items.get(position).getImageDrawable());
        if (items.get(position).hasReadMore) {
            holder.read_more.setVisibility(View.VISIBLE);
        }

        holder.read_more.setOnClickListener(v -> {
            Intent i = new Intent(mContext,ReadMoreActivity.class);
            i.putExtra("sec_no",sectionNo);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            mContext.startActivity(i);
        });
    }

    static class MViewHolder extends RecyclerView.ViewHolder {

        ImageView image, read_more;

        public MViewHolder(View view) {
            super(view);

            image = view.findViewById(R.id.slides_img);
            read_more = view.findViewById(R.id.read_more);
        }
    }
}
