package com.example.base;

import android.app.Application;

public abstract class BaseApp extends Application {
    /**
     * Application初始化
     */
    public abstract void initModuleApp(Application application);

    /**
     * 所有Application初始化后的自定义操作
     */
    public abstract void initModuleData(Application application);
}
