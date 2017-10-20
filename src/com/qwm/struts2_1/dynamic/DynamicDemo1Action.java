package com.qwm.struts2_1.dynamic;

/**
 * @author: wiming
 * @date: 2017-09-18 13:41:20  星期一
 * @decription:
 * 动态调用方法配置
 */
public class DynamicDemo1Action {
    public String add(){
        System.out.println("添加用户!");
        return "success";
    }
    public String delete(){
        System.out.println("删除用户!");
        return "success";
    }
    public String update(){
        System.out.println("修改用户!");
        return "success";
    }
    public String find(){
        System.out.println("查找用户!");
        return "success";
    }
}
