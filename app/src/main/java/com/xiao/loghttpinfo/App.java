package com.xiao.loghttpinfo;

import android.app.Application;

/**
 * Created by XiaoJianjun on 2017/1/16.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化Looger工具
        LogUtil.init(BuildConfig.LOG_DEBUG);
    }
}
