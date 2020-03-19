package com.sunjian.aop;

import org.springframework.stereotype.Component;

/**
 * @author sunjian
 * @date 2020/3/16 8:13
 */
@Component("myCal")
public class MyCal implements Cal {
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int mul(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int div(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
