package com.yanzhenyidai.test;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
public class Audi extends Car {

    public String run1() {
        return "I'm audi";
    }

    public static void main(String[] args) {
        Car audi = new Audi();
        System.out.println(audi.run());
    }
}
