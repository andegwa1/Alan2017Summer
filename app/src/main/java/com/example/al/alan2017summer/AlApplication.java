package com.example.al.alan2017summer;

import android.app.Application;

import com.example.al.alan2017summer.util.UtilLog;

/**
 * Created by Al on 6/19/2017.
 */

public class AlApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
