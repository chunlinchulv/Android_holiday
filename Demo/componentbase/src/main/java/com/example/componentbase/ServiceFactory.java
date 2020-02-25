package com.example.componentbase;

import com.example.componentbase.empty_service.EmptyAccountService;
import com.example.componentbase.service.IAccountService;

//ServiceFactory 接收组件中实现的接口对象的注册以及向外提供特定组件的接口实现。
public class ServiceFactory {
    private IAccountService accountService;

    /**
     * 禁止外部创建ServiceFactory对象
     */
    private ServiceFactory() {

    }

    /**
     * 通过静态内部类方式实现ServiceFactory的单例
     */
    public static ServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    /**
     * 接收Login组件实现的Service实例
     */
    public IAccountService getAccountService() {
        if (accountService == null) {
            accountService  = new EmptyAccountService();
        }
        return accountService;
    }
}
