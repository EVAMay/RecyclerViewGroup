package com.yangyu.recyclerviewgroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.yangyu.recyclerviewgroup.adapter.GroupAdapter;
import com.yangyu.recyclerviewgroup.entity.ChildEntity;
import com.yangyu.recyclerviewgroup.entity.GroupEntity;
import com.yangyu.recyclerviewgroup.entity.HeaderEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView_mian;
    private List<GroupEntity> groupList;
    private List<HeaderEntity> headerList;
    private List<ChildEntity> childList;
    private GroupAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initData() {
        childList=new ArrayList<>();
        childList.add(new ChildEntity("95#","12吨","104油库","",false));
        childList.add(new ChildEntity("98#","15吨","104油库","",false));
        childList.add(new ChildEntity("92#","11吨","104油库","",true));

        headerList=new ArrayList<>();
        headerList.add(new HeaderEntity("2017-08"));
        headerList.add(new HeaderEntity("2017-07"));

        groupList=new ArrayList<>();
        groupList.add(new GroupEntity(new HeaderEntity("2017-07"),childList));
        groupList.add(new GroupEntity(new HeaderEntity("2017-08"),childList));
        setData();
    }

    private void setData() {
        LinearLayoutManager layoutManager=new LinearLayoutManager(getBaseContext());
        mAdapter=new GroupAdapter(getBaseContext(),groupList);
        recyclerView_mian.setLayoutManager(layoutManager);
        recyclerView_mian.setAdapter(mAdapter);
        mAdapter.setOnHeaderClickListener(new GroupedRecyclerViewAdapter.OnHeaderClickListener() {
            @Override
            public void onHeaderClick(GroupedRecyclerViewAdapter adapter, BaseViewHolder holder, int groupPosition) {
                Toast.makeText(getBaseContext(),"点击了第"+(groupPosition+1)+"组组头",Toast.LENGTH_SHORT).show();
            }
        });

        mAdapter.setOnChildClickListener(new GroupedRecyclerViewAdapter.OnChildClickListener() {
            @Override
            public void onChildClick(GroupedRecyclerViewAdapter adapter, BaseViewHolder holder, int groupPosition, int childPosition) {
                Toast.makeText(getBaseContext(),"点击了第"+(groupPosition+1)+"组第"+(childPosition+1)+"个子项",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        recyclerView_mian= (RecyclerView) findViewById(R.id.recyclerView_main);
    }
}
