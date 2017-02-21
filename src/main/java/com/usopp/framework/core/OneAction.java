package com.usopp.framework.core;

/**
 * Created by fov on 2017/2/21.
 */
public class OneAction extends BaseAction{

    @Override
    public void process(String str) {
        System.out.println("one: " + str);
    }
}
