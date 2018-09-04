package com.example.you.myquik.adapter;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.you.myquik.MainActivity;
import com.example.you.myquik.R;
import com.example.you.myquik.bean.MainBean;

import java.util.List;

/**
 * Created by LiuShen on 2018/9/3 0003.
 * 用的一个recyclerview库，brvah，很好用的，一搜就有
 */
public class MainAdapter  extends BaseQuickAdapter<MainBean,BaseViewHolder>{
    public MainAdapter( @Nullable List<MainBean> data) {
        super(R.layout.main_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainBean item) {

        TextView tv=helper.getView(R.id.main_recy_item);
        helper.setText(R.id.main_recy_item,item.getTitle());

        int pos=helper.getAdapterPosition();
        int pos1=helper.getLayoutPosition();

        setMsg("-pos="+pos);
        setMsg("-pos1="+pos1);
            if (pos%11==0){
                int r= (int) (0+Math.random()*(255+0));
                int g= (int) (0+Math.random()*(255+0));
                int b= (int) (0+Math.random()*(255+0));
                tv.setBackgroundColor(Color.rgb(r,g,b));
            }else {
                tv.setBackgroundColor(Color.rgb(255,255,255));
            }

    }


    public  void setMsg(String str) {
        Log.i("tab1", str);
    }
}
