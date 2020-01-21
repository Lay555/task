package com.example.task;

import android.os.Bundle;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.task.adapter.RecyclerviewAdapter;
import com.example.task.adapter.YingxiaoAdapter;
import com.example.task.bean.Recycler;
import com.example.task.bean.Yingxiao;
import java.util.ArrayList;
import java.util.List;
import butterknife.ButterKnife;


public class YingxiaoActivity extends AppCompatActivity {
    ListView lvYingxiao;
    private List<Yingxiao> list=new ArrayList<>();
    private List<Recycler> lists=new ArrayList<>();




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yingxiao);
        ButterKnife.bind(this);
        initData();
        initView();
        initYingxiao();
       YingxiaoAdapter Adapter=new YingxiaoAdapter(YingxiaoActivity.this,list);
       ListView listView=findViewById(R.id.lv_yingxiao);
       listView.setAdapter(Adapter);


    }

    private void initData() {
        for (int i=0;i<5;i++){
            Recycler recycler=new Recycler();
            lists.add(recycler);
            Recycler recycler1=new Recycler();
            lists.add(recycler1);
        }
    }

    private  void initView(){
        RecyclerviewAdapter adapter=new RecyclerviewAdapter(this);
        RecyclerView recyclerView=findViewById(R.id.rv_yingxiao);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        adapter.setHorizontalDataList(lists);
        recyclerView.setAdapter(adapter);

    }


    private void initYingxiao() {
        for (int i=0;i<10;i++){
            Yingxiao yingxiao=new Yingxiao();
            list.add(yingxiao);
            Yingxiao yingxiao1=new Yingxiao();
            list.add(yingxiao1);
        }
    }


}
