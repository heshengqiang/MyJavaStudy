package Spring.DaoImp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect//这个是让spring识别这个是一个切面类
public class AspectJAnno {
    //Before Advice
    @Before(value = "execution(* Spring.Dao.OrderDao.save(..))")//使用注解方式的前置增强配置
    public void Before(){
        System.out.println("Before Advice...");
    }
    //AfterReturning Advice
    @AfterReturning(value = "execution(* Spring.Dao.OrderDao.delete(..))",returning = "result")
    public void After(String result){
        System.out.println("After Advice..."+result);
    }

    //Around Advice
    @Around(value = "execution(* Spring.Dao.OrderDao.update(..))")
    public Object Around(ProceedingJoinPoint proceeding) throws Throwable {
        System.out.println("AroundBefore Advice...");
        Object proceed = proceeding.proceed();
        System.out.println("AroundAfter Advice...");
                return proceed;
    }
    //After Throwing Advice
    @AfterThrowing(value = "execution(* Spring.Dao.OrderDao.find(..))")
    public void AfterThrowing(){
        System.out.println("AfterThrowing Advice...");
    }
    //After Advice
    @After(value = "execution(* Spring.Dao.OrderDao.delete(..))")
    public void After(){
        System.out.println("After Advice,Whether there is an exception or not it must be output");
    }


}
