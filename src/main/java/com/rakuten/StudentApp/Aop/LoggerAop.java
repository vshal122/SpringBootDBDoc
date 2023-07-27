package com.rakuten.StudentApp.Aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggerAop {

    @Before(value ="execution(*  com.rakuten.StudentApp.Controller.IFRCTDetailController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
     log.info("Inside Class .. Inside Method : {}",joinPoint.getSignature());
    }
//    @Before(value ="execution(*  com.rakuten.StudentApp.Controller.IStudentController.*(..))")
//    public void beforeAdvice(JoinPoint joinPoint){
//        log.info("Inside Class .. Inside Method : {}",joinPoint.getSignature());
//    }
}
