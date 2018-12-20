package com.keep.process.process;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/*
 * 广播接收者监听屏幕开启和熄灭
 * */
public class KeepLiveReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_SCREEN_OFF.equals(intent.getAction())) {

            //屏幕关闭，开启透明Activity
            KeepLiveManager.getInstance().startKeepLiveActivity(context);

        } else if (Intent.ACTION_SCREEN_ON.equals(intent.getAction())) {

            //屏幕开启，关闭透明Activity
            KeepLiveManager.getInstance().finishKeepLiveActivity();

        }
    }
}
