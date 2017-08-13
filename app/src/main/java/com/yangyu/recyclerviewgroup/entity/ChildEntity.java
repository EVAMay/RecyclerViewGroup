package com.yangyu.recyclerviewgroup.entity;

/**
 * Created by lenovo on 2017/8/13.
 */

public class ChildEntity {
    String oilType;
    String oilNum;
    String oilDepot;
    String cheakDate;
    boolean isCheaked;

    public ChildEntity(String oilType, String oilNum, String oilDepot, String cheakDate, boolean isCheaked) {
        this.oilType = oilType;
        this.oilNum = oilNum;
        this.oilDepot = oilDepot;
        this.cheakDate = cheakDate;
        this.isCheaked = isCheaked;
    }

    @Override
    public String toString() {
        return "ChildEntity{" +
                "oilType='" + oilType + '\'' +
                ", oilNum='" + oilNum + '\'' +
                ", oilDepot='" + oilDepot + '\'' +
                ", cheakDate='" + cheakDate + '\'' +
                ", isCheaked=" + isCheaked +
                '}';
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    public String getOilNum() {
        return oilNum;
    }

    public void setOilNum(String oilNum) {
        this.oilNum = oilNum;
    }

    public String getOilDepot() {
        return oilDepot;
    }

    public void setOilDepot(String oilDepot) {
        this.oilDepot = oilDepot;
    }

    public String getCheakDate() {
        return cheakDate;
    }

    public void setCheakDate(String cheakDate) {
        this.cheakDate = cheakDate;
    }

    public boolean isCheaked() {
        return isCheaked;
    }

    public void setCheaked(boolean cheaked) {
        isCheaked = cheaked;
    }
}
