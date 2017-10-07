package com.raokui.rtools.activity;

import android.os.Bundle;

import com.raokui.rtools.R;
import com.raokui.rtools.base.BaseActivity;
import com.raokui.rtools.contract.MainContract;
import com.raokui.rtools.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainContract.View, MainPresenter>
        implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}
