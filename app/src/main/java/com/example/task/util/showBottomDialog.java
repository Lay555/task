package com.example.task.util;

import android.app.Dialog;
import android.content.Context;
import android.icu.text.Transliterator;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;

import com.example.task.R;

import java.util.List;

import butterknife.BindView;


public class showBottomDialog {
    @BindView(R.id.rl_sp)
    RelativeLayout rlSp;
    @BindView(R.id.rl_fz)
    RelativeLayout rlFz;
    @BindView(R.id.rl_ms)
    RelativeLayout rlMs;
    @BindView(R.id.rl_wj)
    RelativeLayout rlWj;
    @BindView(R.id.rl_yl)
    RelativeLayout rlYl;
    @BindView(R.id.rl_ms2)
    RelativeLayout rlMs2;
    @BindView(R.id.rl_wj2)
    RelativeLayout rlWj2;
    private Context context;
    private View view;



    public void BottomDialog(Context context) {
        //1、使用Dialog、设置style
        final Dialog dialog = new Dialog(context, R.style.DialogTheme);
        //2、设置布局
        view = View.inflate(context, R.layout.dialog_activity, null);
        dialog.setContentView(view);

        Window window = dialog.getWindow();
        //设置弹出位置
        window.setGravity(Gravity.BOTTOM);
        //设置弹出动画
        window.setWindowAnimations(R.style.main_menu_animStyle);
        //设置对话框大小
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();

        dialog.findViewById(R.id.rl_sp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        dialog.findViewById(R.id.rl_fz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.findViewById(R.id.rl_ms).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.findViewById(R.id.rl_wj).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.findViewById(R.id.rl_yl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.findViewById(R.id.rl_ms2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.getKeyValueClick("点击了daoshudier",2,null);
                dialog.dismiss();
            }
        });
        dialog.findViewById(R.id.rl_wj2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //传入数据
                listener.getKeyValueClick("点击了这里",1,null);
                dialog.dismiss();
            }
        });

    }
    private OnKeyValueListener listener;
    public interface OnKeyValueListener {
        //回调的方法里面的数据类型可以随便定义
        //回调的方法个数随便几个
        void  getKeyValueClick(String value, int a, List<String> list);
        void  returnPosition(int position);
    }
    public void OnChooseClickListener(OnKeyValueListener onKeyValueListener){
        this.listener=onKeyValueListener;
    }

}

