package com.example.searchtwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private int[] mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    Adapter(Context context, int[] data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    // inflates the cell layout from xml when needed
    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.frament_cell1, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each cell
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.myTextView.setText(mData[position]);
        if (mData[position] == 1){
            holder.picture.setImageResource(R.drawable.bird);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }if (mData[position] == 2){
            holder.picture.setImageResource(R.drawable.catthum);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }if (mData[position] == 3){
            holder.picture.setImageResource(R.drawable.demon);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }if (mData[position] == 4){
            holder.picture.setImageResource(R.drawable.knifeugroza);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }if (mData[position] == 5){
            holder.picture.setImageResource(R.drawable.pinguin);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }if (mData[position] == 6){
            holder.picture.setImageResource(R.drawable.poc);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }if (mData[position] == 7){
            holder.picture.setImageResource(R.drawable.racoon);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }if (mData[position] == 8){
            holder.picture.setImageResource(R.drawable.svidetel);
            holder.myTextView.setText(String.valueOf(mData[position]));
        }
//        else {
//            holder.picture.setImageResource(R.drawable.ic_launcher_foreground);
//            holder.myTextView.setText(String.valueOf(mData[position]));
//        }

    }

    // total number of cells
    @Override
    public int getItemCount() {
        return mData.length;
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;
        ImageView picture;

        ViewHolder(View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            myTextView = itemView.findViewById(R.id.info_text);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    int getItem(int id) {
        return mData[id];
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}