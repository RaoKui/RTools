package com.raokui.rtools.contract;

import com.raokui.rtools.bean.PlanBean;

import java.util.List;

/**
 * Created by RaoKui on 2017/10/14.
 */

public interface PlanContract {

    interface View {
        void showPlanList(List<PlanBean> dataList);

    }

    interface Presenter {
        void getPlanList(int type);
        void getAllPlan();
    }

}
