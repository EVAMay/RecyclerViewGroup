package com.yangyu.recyclerviewgroup.entity;

import java.util.List;

/**
 * Created by lenovo on 2017/8/13.
 */

public class GroupEntity {
    HeaderEntity headerEntity;
    List<ChildEntity> list;

    public GroupEntity(HeaderEntity headerEntity, List<ChildEntity> list) {
        this.headerEntity = headerEntity;
        this.list = list;
    }

    @Override
    public String toString() {
        return "GroupEntity{" +
                "headerEntity=" + headerEntity +
                ", list=" + list +
                '}';
    }

    public HeaderEntity getHeaderEntity() {
        return headerEntity;
    }

    public void setHeaderEntity(HeaderEntity headerEntity) {
        this.headerEntity = headerEntity;
    }

    public List<ChildEntity> getList() {
        return list;
    }

    public void setList(List<ChildEntity> list) {
        this.list = list;
    }
}
