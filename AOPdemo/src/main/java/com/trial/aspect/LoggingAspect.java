package com.trial.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.trial.service.*.*(..))")
    public void before() {

        System.out.println(">>> BEFORE: Method is about to execute");
    }

    @After("execution(* com.trial.service.*.*(..))")
    public void after() {

        System.out.println(">>> AFTER: Method execution finished");
    }

    @AfterReturning(
            pointcut = "execution(* com.trial.service.*.*(..))",
            returning = "result"
    )
    public void afterReturning(Object result) {

        System.out.println(">>> AFTER RETURNING: Result = " + result);
    }

    @AfterThrowing(
            pointcut = "execution(* com.trial.service.*.*(..))",
            throwing = "exception"
    )
    public void afterThrowing(Exception exception) {

        System.out.println(
                ">>> AFTER THROWING: " + exception.getMessage()
        );
    }

    @Around("execution(* com.trial.service.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint)
            throws Throwable {

        System.out.println(">>> AROUND: Before target method");

        Object result = joinPoint.proceed();

        System.out.println(">>> AROUND: After target method");

        return result;
    }
}