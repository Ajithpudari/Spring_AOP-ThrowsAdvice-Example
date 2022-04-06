package javaspr.aop;


import org.springframework.aop.ThrowsAdvice;



public class CatchThroughException implements ThrowsAdvice {

    public void afterThrowing(NullPointerException e) throws Throwable {
        System.out.println("Inside CatchThrowException.afterThrowing() method...");
        System.out.println("Running after throwing exception...");
    }
}
