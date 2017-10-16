package com.raokui.rtools.application;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.raokui.rtools.greendao.gen.DaoMaster;
import com.raokui.rtools.greendao.gen.DaoSession;

/**
 * Created by RaoKui on 2017/10/14.
 */

public class MyApplication extends Application {

    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        initSql();
    }

    private void initSql() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "rtool.db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }
}
