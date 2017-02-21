package com.usopp.framework.core;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fov on 2017/2/21.
 */
public class ActionTest {

    Map<ActionEnum, BaseAction> map = new HashMap<ActionEnum, BaseAction>();

    @Test
    public void test() {

        init();

        map.get(ActionEnum.ONE).process("yes");
        map.get(ActionEnum.TWO).process("yes");
    }

    @Test
    public void testEnum() {
        for (ActionEnum action : ActionEnum.values()) {
            System.out.println(action + " : " + action.getContext());
        }

        System.out.println(ActionEnum.ONE.getDeclaringClass());
    }

    private void init(){

        OneAction one = new OneAction();

        TwoAction two = new TwoAction();

        map.put(ActionEnum.ONE, one);

        map.put(ActionEnum.TWO, two);
    }
}
