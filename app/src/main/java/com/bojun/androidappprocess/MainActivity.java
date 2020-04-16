package com.bojun.androidappprocess;


import android.app.Activity;
import android.os.Bundle;

import com.bojun.lib_process.AndroidAppProcess;
import com.bojun.lib_process.ProcessManager;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取正在运行的程序信息
        List<AndroidAppProcess> androidAppProcessList = ProcessManager.getRunningAppProcesses();
    }
}
