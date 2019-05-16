package Spring.DaoImp;

import org.aspectj.lang.ProceedingJoinPoint;

//目标对象ProductDao的切面类
public class AspectJImp {
    //前置通知方法
    public void CheckIdentity(){
    System.out.println("前置通知，身份校验！");
    }
    //后置通知
    public void RecordLog(){
        System.out.println("后置通知，日志记录！");
    }
    //环绕通知
    public void Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知！");
        Object proceed =joinPoint.proceed();//这里是执行目标类方法，即在目标方法前后都执行一段代码，这里只做输出处理。
        System.out.println("环绕后通知！");
    }
    //异常通知
    public void AfterThrows(){
        System.out.println("异常抛出通知！");
    }
    //最终通知
    public void Finally(){
        System.out.println("最终通知，一定会执行！");
    }
}
