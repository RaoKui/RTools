package com.raokui.rtools.sql;

import com.raokui.rtools.application.MyApplication;
import com.raokui.rtools.bean.PlanBean;
import com.raokui.rtools.greendao.gen.PlanBeanDao;

import org.greenrobot.greendao.query.Query;

import java.util.List;

/**
 * Created by panmeilan on 2017/10/16.
 */

public class PlanDao {
    public static void insertPlan(PlanBean planBean) {
        MyApplication.getDaoInstant().getPlanBeanDao().insert(planBean);
    }

    public static void deletePlan(long id) {
        MyApplication.getDaoInstant().getPlanBeanDao().deleteByKey(id);
    }

    public static void updatePlan(PlanBean planBean) {
        MyApplication.getDaoInstant().getPlanBeanDao().update(planBean);
    }

    public static List<PlanBean> queryAllPlan() {
        return MyApplication.getDaoInstant().getPlanBeanDao().loadAll();
    }

    /**
     * 获取已完成计划列表
     * @return
     */
    public static List<PlanBean> queryCompletePlan() {
        Query<PlanBean> mQuery = MyApplication.getDaoInstant().getPlanBeanDao()
                .queryBuilder().where(PlanBeanDao.Properties.Is_completed.eq(1)).build();
        return mQuery.list();
    }

    public static List<PlanBean> queryUnCompletePlan(){
        Query<PlanBean> mQuery = MyApplication.getDaoInstant().getPlanBeanDao()
                .queryBuilder().where(PlanBeanDao.Properties.Is_completed.eq(0)).build();
        return mQuery.list();
    }
}
