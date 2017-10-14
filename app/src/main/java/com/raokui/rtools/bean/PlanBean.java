package com.raokui.rtools.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by RaoKui on 2017/10/14.
 */
@Entity
public class PlanBean {
    @Id(autoincrement = true)
    public long id ;

    @Property(nameInDb = "create_date")
    public String create_date;

//    @Property(nameInDb = "end_date")
//    var end_date: String? = null


    @Property(nameInDb = "end_year")
    public int  end_year=2017;

    @Property(nameInDb = "end_month")
    public int end_month= 1;

    @Property(nameInDb = "end_day")
    public int end_day = 1;

    @Property(nameInDb = "is_repeat")
    public int is_repeat = 0;

    @Property(nameInDb = "isHas_child")
    public int isHas_child = 0;

    @Property(nameInDb = "is_completed")
    public  int is_completed = 0;

    @Property(nameInDb = "main_plan")
    public   String main_plan;

    @Generated(hash = 1476116099)
    public PlanBean(long id, String create_date, int end_year, int end_month,
            int end_day, int is_repeat, int isHas_child, int is_completed,
            String main_plan) {
        this.id = id;
        this.create_date = create_date;
        this.end_year = end_year;
        this.end_month = end_month;
        this.end_day = end_day;
        this.is_repeat = is_repeat;
        this.isHas_child = isHas_child;
        this.is_completed = is_completed;
        this.main_plan = main_plan;
    }

    @Generated(hash = 1985632014)
    public PlanBean() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreate_date() {
        return this.create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public int getEnd_year() {
        return this.end_year;
    }

    public void setEnd_year(int end_year) {
        this.end_year = end_year;
    }

    public int getEnd_month() {
        return this.end_month;
    }

    public void setEnd_month(int end_month) {
        this.end_month = end_month;
    }

    public int getEnd_day() {
        return this.end_day;
    }

    public void setEnd_day(int end_day) {
        this.end_day = end_day;
    }

    public int getIs_repeat() {
        return this.is_repeat;
    }

    public void setIs_repeat(int is_repeat) {
        this.is_repeat = is_repeat;
    }

    public int getIsHas_child() {
        return this.isHas_child;
    }

    public void setIsHas_child(int isHas_child) {
        this.isHas_child = isHas_child;
    }

    public int getIs_completed() {
        return this.is_completed;
    }

    public void setIs_completed(int is_completed) {
        this.is_completed = is_completed;
    }

    public String getMain_plan() {
        return this.main_plan;
    }

    public void setMain_plan(String main_plan) {
        this.main_plan = main_plan;
    }

}
