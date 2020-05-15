package com.apps.tugasutsakb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<DailyActivity> mData;

    public RecyclerViewAdapter(Context mContext, List<DailyActivity> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_dailyactivity,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_daily.setText(mData.get(position).getDailyactivity());
        holder.tv_deskrip.setText((mData.get(position).getDeskripsi()));
        holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {

          return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_daily;
        private TextView tv_deskrip;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_daily = (TextView) itemView.findViewById(R.id.textDailyactivity);
            tv_deskrip = (TextView) itemView.findViewById(R.id.desk_activity);
            img = (ImageView)   itemView.findViewById(R.id.ic_dailyactivity);
        }
    }
}
