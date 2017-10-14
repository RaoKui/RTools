package com.raokui.rtools.contract;

import com.raokui.rtools.bean.PlanBean;

import java.util.ArrayList;

/**
 * Created by RaoKui on 2017/10/14.
 */

public interface PlanContract {

    interface View {
        void showPlanList(ArrayList<PlanBean> dataList);

    }

    interface Presenter {
        void getPlanList(int type);
    }

}
