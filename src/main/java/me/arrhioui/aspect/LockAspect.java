package me.arrhioui.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LockAspect {

    @Around(value = "@annotation(me.arrhioui.aspect.Lock)")
    public Object lockMethod(ProceedingJoinPoint pjp){
        System.out.println("The method " + pjp.getSignature() +", is Locked");
        return null;
    }
}
