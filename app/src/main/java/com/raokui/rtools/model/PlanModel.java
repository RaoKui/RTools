package com.raokui.rtools.model;

import com.raokui.rtools.bean.PlanBean;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;


/**
 * Created by RaoKui on 2017/10/14.
 */

public class PlanModel {

    public Observable<ArrayList<PlanBean>> getPlanList(int type) {
        return Observable.create(new ObservableOnSubscribe<ArrayList<PlanBean>>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<ArrayList<PlanBean>> e) throws Exception {
                
            }
        });
    }


}
