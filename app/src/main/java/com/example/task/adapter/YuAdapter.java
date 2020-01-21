package com.example.task.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.task.R;
import com.example.task.bean.Yu;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class YuAdapter extends BaseAdapter {
    private Context context;
    private List<Yu> yuList;
    LayoutInflater mInflater;


    public YuAdapter(Context context, List<Yu> yuList) {
        this.yuList = yuList;
        this.context = context;
        mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return yuList.size();
    }

    @Override
    public Object getItem(int position) {
        return yuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_activity, parent, false);
            Yu yu =yuList.get(position);
            yu.setTime("2018-06-01");
            yu.setWallet("15569327");
            yu.setMoney("50");

        }
        return convertView;
    }

    static
    class ViewHolder {
        @BindView(R.id.tv_time)
        TextView tvTime;
        @BindView(R.id.ll_time)
        LinearLayout llTime;
        @BindView(R.id.tv_wallet)
        TextView tvWallet;
        @BindView(R.id.ll_qian)
        LinearLayout llQian;
        @BindView(R.id.tv_money)
        TextView tvMoney;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
