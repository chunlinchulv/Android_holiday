package com.example.componentbase.service;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

// IAccountService 接口中定义了 Login 组件向外提供的数据传递的接口方法
public interface IAccountService {
    /**
     * 是否已经登陆
     * @return
     */
    boolean isLogin();

    /**
     * 获取登录用户的AccountId
     * @return
     */
    String getAccountId();

    /**
     * 创建UserFragment
     * @param activity
     * @param containerId
     * @param manager
     * @param bundle
     * @param tag
     * @return
     */
    Fragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle,String tag);
}
