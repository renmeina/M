package com.lanou3g.base;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Required;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
//泛型也可以称之为类的参数
//    参数的类型是某个类 而不是对象
//    T:type
//    E:Element/Entity
public class BaseAction<T,S> extends ActionSupport implements ModelDriven<T>{
    protected T model;
    protected S service;

    public BaseAction() {
//        获取当前类的Class 当前类有可能是BaseAction 也有可能是他的子类 getClass是子类的
        Class<? extends BaseAction> clazz = getClass();
//        在获取父类的泛型参数 有一个类继承ClassAction这个类 我们没写
        ParameterizedType type = (ParameterizedType) clazz.getGenericSuperclass();
//        获取所有的泛型集合 (因为可能会有多个泛型)
        Type[] actualTypeArguments = type.getActualTypeArguments();
//        因为当前类只有一个泛型参数

//        所以取第0个,就获取到了泛型的Class
        Class modelClass = (Class) actualTypeArguments[0];
        try {
            model = (T) modelClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T getModel() {
        return model;
    }
    //    向Session中存放数据
    public void sessionPut(String key,Object value){
        ActionContext.getContext().getSession().put(key,value);
    }
    //    application
    public void applicationPut(String key,Object value){
        ActionContext.getContext().getApplication().put(key,value);

    }
//    context
    public void context(String key,Object value){
        ActionContext.getContext().put(key,value);
    }
    public void getValueStack(Object value){
        ActionContext.getContext().getValueStack().push(value);
    }
//    request

    public HttpServletRequest getRequest(){
        return ServletActionContext.getRequest();
    }
    public HttpServletResponse getResponse(){
        return ServletActionContext.getResponse();
    }
//    @Required
    public void setService(S service) {
        this.service = service;
    }

//    方法中的泛型
//    public <E> List<E> create(Class<E> clazz){
//        return clazz;
//    }
}
