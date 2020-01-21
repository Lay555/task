package com.example.task.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.task.R;
import com.example.task.bean.Recycler;
import java.util.ArrayList;
import java.util.List;


public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.HorizontalViewHolder> {

    TextView tvXianshi;
    private Context mContext;
    private List<Recycler> lists = new ArrayList<>();



    public RecyclerviewAdapter(Context context) {
        mContext = context;
    }


    public void setHorizontalDataList(List<Recycler> list) {
        lists = list;

    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_recyclerview, parent, false);
        tvXianshi =view.findViewById(R.id.tv_xianshi);
        return new HorizontalViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
        holder.tvXianshi.setText(lists.get(position).getName());
        holder.tvXianshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<lists.size();i++){
                    lists.get(i).setSelect(false);
                }lists.get(position).setSelect(true);
               notifyDataSetChanged();
            }
        });

        if(lists.get(position).isSelect()){
            holder.tvXianshi.setTextColor(Color.parseColor("#F33333"));
        }else{
            holder.tvXianshi.setTextColor(Color.parseColor("#666666"));
        }

    }


    @Override
    public int getItemCount() {
        return lists.size();
    }



    public class HorizontalViewHolder extends RecyclerView.ViewHolder {
        TextView tvXianshi;

        public HorizontalViewHolder(@NonNull View view) {
            super(view);
            tvXianshi = view.findViewById(R.id.tv_xianshi);

        }


    }



}
