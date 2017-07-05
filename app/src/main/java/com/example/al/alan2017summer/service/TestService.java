package com.example.al.alan2017summer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;

import com.example.al.alan2017summer.util.UtilLog;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Al on 7/3/2017.
 */

public class TestService extends Service {

    private Timer timer;
    private int update = 0;
    public static final String ACTION = "action";
    public static final String UPDATE = "TestAction";


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        try{
            Thread.sleep(30000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        String value = intent.getStringExtra("Service");
//        timer.schedule(new UpdateTask(),0,1000);
        if(value.equals("Start")){
           timer.schedule(new UpdateTask(), 0, 2000);
        }else if(value.equals("Stop")){
            timer.cancel();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private class UpdateTask extends TimerTask{
        public void run(){
            Intent intent = new Intent();
            intent.setAction(ACTION);
            intent.putExtra(UPDATE, ++update);
            sendBroadcast(intent);
            UtilLog.d("Service", update+"");
        }
    }

}
