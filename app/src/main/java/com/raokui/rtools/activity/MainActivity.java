package com.raokui.rtools.activity;

import android.support.v4.app.FragmentTransaction;

import com.raokui.rtools.R;
import com.raokui.rtools.base.BaseActivity;
import com.raokui.rtools.contract.MainContract;
import com.raokui.rtools.fragment.PlanFragment;
import com.raokui.rtools.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainContract.View, MainPresenter>
        implements MainContract.View {


    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        PlanFragment planFragment = new PlanFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fl_container, planFragment).show(planFragment).commit();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}
