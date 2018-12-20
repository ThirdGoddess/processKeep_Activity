package com.keep.process.process;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1像素且透明Activity提升App进程优先级
        KeepLiveManager.getInstance().registerKeepLiveReceiver(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //反注册防止内存泄漏
        KeepLiveManager.getInstance().unregisterKeepLiveReceiver(this);
    }
}
