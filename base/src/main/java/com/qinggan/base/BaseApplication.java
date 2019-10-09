package com.qinggan.base;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application {
    private static final String TAG = "BaseApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate");
//        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.debuggable();
            ARouter.printStackTrace();
//        }

        ARouter.init(this);
    }
}
