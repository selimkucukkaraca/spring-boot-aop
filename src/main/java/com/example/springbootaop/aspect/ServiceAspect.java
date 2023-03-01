package com.example.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.example.springbootaop.service.*.*(..))")
    public void mesajVerMetodundanOnce(JoinPoint joinPoint){
        System.out.println("mesaj ver metodundan once parametre yakalandi, param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.example.springbootaop.service.*.*(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint){
        System.out.println("mesaj ver metodundan sonra parametre yakalandi, param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

}
