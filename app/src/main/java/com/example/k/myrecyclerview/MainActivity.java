package com.example.k.myrecyclerview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int pic_id[]={R.mipmap.a,R.mipmap.b,R.mipmap.c,R.mipmap.d};
    Bitmap bitmap[]  = new Bitmap[10];
    private RecyclerView recyclerView;
    private List<String> mDatas;
    private MyRecyclerAdapter recycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_pic_data();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView );
        recycleAdapter= new MyRecyclerAdapter(bitmap);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置布局管理器
        recyclerView.setLayoutManager(layoutManager);
        //设置为垂直布局，这也是默认的
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        //设置Adapter
        recyclerView.setAdapter( recycleAdapter);
        //设置增加或删除条目的动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    private void init_pic_data() {
    for(int a = 0;a<pic_id.length;a++){
        Log.i("ok",">>>>>>>>>>>>>>>>>");
        bitmap[a] = BitmapFactory.decodeResource(getResources(),pic_id[a]);
    }
    }
}
