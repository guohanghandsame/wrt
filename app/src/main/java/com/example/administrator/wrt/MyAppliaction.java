package com.example.administrator.wrt;


import android.app.Application;

import com.mob.MobSDK;

public class MyAppliaction extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this);
    }
}
