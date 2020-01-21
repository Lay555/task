package com.example.task;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.task.util.showBottomDialog;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_tc)
    Button btTc;
    private showBottomDialog show = new showBottomDialog();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
    @OnClick({R.id.bt_tc,R.id.tv_hello})
    public void onViewClicked() {
        show.BottomDialog(MainActivity.this);
        show.OnChooseClickListener(new showBottomDialog.OnKeyValueListener() {
            @Override
            //这里的数据就是回调回来的
            public void getKeyValueClick(String value, int a, List<String> list) {

            }

            @Override
            public void returnPosition(int position) {


            }
        });
    }




}
