package com.yangyu.recyclerviewgroup.adapter;

import android.content.Context;

import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.yangyu.recyclerviewgroup.R;
import com.yangyu.recyclerviewgroup.entity.ChildEntity;
import com.yangyu.recyclerviewgroup.entity.GroupEntity;

import java.util.List;

/**
 * Created by lenovo on 2017/8/13.
 */

public class GroupAdapter extends GroupedRecyclerViewAdapter {
    List<GroupEntity> groupEntityList;

    public GroupAdapter(Context context,List<GroupEntity> groupEntityList) {
        super(context);
        this.groupEntityList=groupEntityList;
    }

    @Override
    public int getGroupCount() {
        return groupEntityList==null ? 0:groupEntityList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        List<ChildEntity> childEntityList=groupEntityList.get(groupPosition).getList();
        return childEntityList==null?0:childEntityList.size();
    }

    @Override
    public boolean hasHeader(int groupPosition) {
        return true;
    }

    @Override
    public boolean hasFooter(int groupPosition) {
        return false;
    }

    @Override
    public int getHeaderLayout(int viewType) {
        return R.layout.item_group;
    }

    @Override
    public int getFooterLayout(int viewType) {
        return 0;
    }

    @Override
    public int getChildLayout(int viewType) {
        return R.layout.item_child;
    }

    @Override
    public void onBindHeaderViewHolder(BaseViewHolder holder, int groupPosition) {
        GroupEntity groupEntity=groupEntityList.get(groupPosition);
        holder.setText(R.id.item_date_group,groupEntity.getHeaderEntity().getMonthData());

    }

    @Override
    public void onBindFooterViewHolder(BaseViewHolder holder, int groupPosition) {

    }

    @Override
    public void onBindChildViewHolder(BaseViewHolder holder, int groupPosition, int childPosition) {
        ChildEntity childEntity=groupEntityList.get(groupPosition).getList().get(childPosition);
        holder.setText(R.id.item_oilType_child,childEntity.getOilType());
        holder.setText(R.id.item_oilNum_child,childEntity.getOilNum());
        holder.setText(R.id.item_oilDepot_child,childEntity.getOilDepot());
        if (childEntity.isCheaked()) {
            holder.setText(R.id.item_cheak_child, "已签认");
        } else {
            holder.setText(R.id.item_cheak_child, "签认");
        }
    }
}
