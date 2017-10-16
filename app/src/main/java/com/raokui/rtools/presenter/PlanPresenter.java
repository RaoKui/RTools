package com.raokui.rtools.presenter;

import com.raokui.rtools.base.BasePresenter;
import com.raokui.rtools.bean.PlanBean;
import com.raokui.rtools.contract.PlanContract;
import com.raokui.rtools.model.PlanModel;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by RaoKui on 2017/10/14.
 */

public class PlanPresenter extends BasePresenter<PlanContract.View> implements PlanContract.Presenter {



    @Override
    public void getPlanList(int type) {
            new PlanModel().getPlanList(type)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<PlanBean>>() {
                        @Override
                        public void onSubscribe(@NonNull Disposable d) {

                        }

                        @Override
                        public void onNext(@NonNull List<PlanBean> planBeen) {
                            mView.showPlanList(planBeen);
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
    }

    @Override
    public void getAllPlan() {
//        new PlanModel().
    }
}
