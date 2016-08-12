package com.example.k.myrecyclerview;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by k on 2016/8/11.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    Bitmap bitmap[] = new Bitmap[10];

    public MyRecyclerAdapter(Bitmap[] id) {
        this.bitmap = id;
    }

    @Override
    public MyRecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_layout, parent, false);
        MyRecyclerAdapter.MyViewHolder view_holder = new MyRecyclerAdapter.MyViewHolder(view);
        return view_holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.i("ok","position = "+position);
    holder.image.setImageBitmap(bitmap[position]);
    }


    @Override
    public int getItemCount() {
        return 4;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
    image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
