package ru.ibs;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FuelExceptionHandleAspect {
    @Around("@annotation(ru.ibs.FuelExceptionHandle)")
    public Object handle(ProceedingJoinPoint pjp) throws Throwable{
        try {
            return pjp.proceed();
        } catch(Exception e){
            return "error";
        }
    }

}
