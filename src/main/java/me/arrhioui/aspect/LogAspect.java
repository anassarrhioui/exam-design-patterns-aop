package me.arrhioui.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {


    @Before(value = "@annotation(me.arrhioui.aspect.Log)")
    public void log(JoinPoint joinPoint){
        System.out.println("Execution of " + joinPoint.getSignature().getName());
    }
}
