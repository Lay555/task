package com.example.task;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.task.adapter.YuAdapter;
import com.example.task.bean.Yu;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SzActivity extends AppCompatActivity {

    @BindView(R.id.tv_yu)
    TextView tvYu;
    @BindView(R.id.iv_yu)
    ImageView ivYu;
    @BindView(R.id.tv_benyue)
    TextView tvBenyue;
    @BindView(R.id.lv)
    ListView lv;
    private List<Yu> yuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sz);
        ButterKnife.bind(this);
        //拿到数据并放到适配器上
        initYu();//初始化数据
        YuAdapter adapter=new YuAdapter(SzActivity.this,yuList);
        //把适配器上的数据传递给listview
        ListView listView=findViewById(R.id.lv);
        listView.setAdapter(adapter);

    }

    private void initYu() {
        for (int i=0;i<10;i++){
            Yu a=new Yu();
            yuList.add(a);
            Yu b=new Yu();
            yuList.add(b);
            Yu c=new Yu();
            yuList.add(c);
            Yu d=new Yu();
            yuList.add(d);

        }
    }
}
