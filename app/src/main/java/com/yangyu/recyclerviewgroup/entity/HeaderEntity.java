package com.yangyu.recyclerviewgroup.entity;

/**
 * Created by lenovo on 2017/8/13.
 */

public class HeaderEntity {
    String MonthData;

    public HeaderEntity(String monthData) {
        MonthData = monthData;
    }

    @Override
    public String toString() {
        return "HeaderEntity{" +
                "MonthData='" + MonthData + '\'' +
                '}';
    }

    public String getMonthData() {
        return MonthData;
    }

    public void setMonthData(String monthData) {
        MonthData = monthData;
    }
}
