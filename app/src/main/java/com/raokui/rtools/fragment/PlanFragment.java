package com.raokui.rtools.fragment;

import android.os.Bundle;

import com.raokui.rtools.R;
import com.raokui.rtools.base.BaseFragment;
import com.raokui.rtools.bean.PlanBean;
import com.raokui.rtools.contract.PlanContract;
import com.raokui.rtools.presenter.PlanPresenter;

import java.util.List;

/**
 * Created by RaoKui on 2017/10/14.
 */

public class PlanFragment extends BaseFragment<PlanContract.View, PlanPresenter>
        implements PlanContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_plan;
    }

    @Override
    protected PlanPresenter initPresenter() {
        return new PlanPresenter();
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        mPresenter.getPlanList(0);
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void showPlanList(List<PlanBean> dataList) {

    }
}
