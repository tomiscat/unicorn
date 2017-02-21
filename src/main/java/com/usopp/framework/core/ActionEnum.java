package com.usopp.framework.core;

/**
 * Created by fov on 2017/2/21.
 */
public enum ActionEnum {
    ONE("OneAction"), TWO("TwoAction");

    private String context;

    ActionEnum(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}
