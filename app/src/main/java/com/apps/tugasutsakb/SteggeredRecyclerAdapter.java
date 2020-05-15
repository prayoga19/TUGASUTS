package com.apps.tugasutsakb;

// tanggal pengerjaan : 15/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SteggeredRecyclerAdapter extends RecyclerView.Adapter<SteggeredRecyclerAdapter.ImageViewHolder> {

    Context mcontext;
    List<row> mdata;

    public SteggeredRecyclerAdapter(Context mcontext, List<row> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup ViewGroup, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.row_item_gallery,ViewGroup,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int i) {

        //bind image here
        imageViewHolder.img.setImageResource(mdata.get(i).getImg());
    }

    @Override
    public int getItemCount() {

        return mdata.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView img;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.row_img);

    }
}

}
