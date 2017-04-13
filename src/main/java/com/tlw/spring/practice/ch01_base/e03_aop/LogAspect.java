
package com.tlw.spring.practice.ch01_base.e03_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by 唐力伟 on 2017/3/27 21:50.
 * step5. 编写切面
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.tlw.spring.practice.ch01_base.e03_aop.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());
    }

    //注意:第一个星号后面有个空格
    @Before("execution(* com.tlw.spring.practice.ch01_base.e03_aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}
