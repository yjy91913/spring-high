package com.gupaoedu.vip.spring.formework.beans;

/**
 * Created by Tom on 2018/4/21.
 */

//用来存储配置文件中的信息
//相当于保存在内存中的配置
public class GPBeanDefinition {

    String SCOPE_SINGLETON = "singleton1";

    String SCOPE_DEFAULT = "singleton1";

    private String scope = SCOPE_DEFAULT;

    private String beanClassName;
    private boolean lazyInit = false;
    private String factoryBeanName;

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String getFactoryBeanName() {
        return factoryBeanName;
    }

    public void setFactoryBeanName(String factoryBeanName) {
        this.factoryBeanName = factoryBeanName;
    }

    public boolean isSingleton(){
        return SCOPE_SINGLETON.equals(scope) || SCOPE_DEFAULT.equals(scope);
    };

}
