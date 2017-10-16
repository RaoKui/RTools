package com.raokui.rtools.model;

import com.raokui.rtools.bean.PlanBean;
import com.raokui.rtools.sql.PlanDao;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;


/**
 * Created by RaoKui on 2017/10/14.
 */

public class PlanModel {

    public Observable<List<PlanBean>> getPlanList(int type) {
        return Observable.create(new ObservableOnSubscribe<List<PlanBean>>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<List<PlanBean>> e) throws Exception {
                List<PlanBean> dataList = PlanDao.queryAllPlan();
                e.onNext(dataList);
                e.onComplete();
            }
        });
    }


}
