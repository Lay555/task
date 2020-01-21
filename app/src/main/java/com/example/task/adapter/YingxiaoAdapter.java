package com.example.task.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task.R;
import com.example.task.bean.Yingxiao;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class YingxiaoAdapter extends BaseAdapter {
    private Context context;
    private List<Yingxiao> list;
    LayoutInflater inflater;

    public YingxiaoAdapter(Context context, List<Yingxiao> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_yingxiao_activity, parent, false);
            Yingxiao yingxiao = list.get(position);
            yingxiao.setHead("");
            yingxiao.setName("乐町白色潮流百搭连衣裙T恤裙甜美");
            yingxiao.setJiage("¥125.00");
            yingxiao.setYi("已售 10");
            yingxiao.setMiaosha("秒杀数量 258");
            yingxiao.setMiao("秒杀时间      2019-07-25");
            yingxiao.setTime("时间段：  17：00-18：00");

        }

        return convertView;
    }



    static
    class ViewHolder {
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_jiage)
        TextView tvJiage;
        @BindView(R.id.tv_yi)
        TextView tvYi;
        @BindView(R.id.tv_miaosha)
        TextView tvMiaosha;
        @BindView(R.id.tv_miao)
        TextView tvMiao;
        @BindView(R.id.tv_time)
        TextView tvTime;
        @BindView(R.id.iv_head)
        ImageView ivHead;


        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
