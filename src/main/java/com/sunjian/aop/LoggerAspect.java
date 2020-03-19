package com.sunjian.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author sunjian
 * @date 2020/3/16 9:20
 */
@Aspect
@Component
public class LoggerAspect {
    @Before(value = "execution(public int com.sunjian.aop.MyCal.*(..))")
    public void before(JoinPoint joinPoint) {
        // 获取方法名
        String name = joinPoint.getSignature().getName();
        // 参数列表
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name + "的参数是 " + args);
    }

    @AfterReturning(value = "execution(public int com.sunjian.aop.MyCal.*(..))", returning = "result")
    public void after(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + "方法的执行结果是 " + result);
    }

    @After(value = "execution(public int com.sunjian.aop.MyCal.*(..))")
    public void after(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + "业务执行完毕...");
    }

    @AfterThrowing(value = "execution(public int com.sunjian.aop.MyCal.*(..))", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e){
        System.out.println(joinPoint.getSignature().getName() + "方法抛出异常 " + e);
    }
}
