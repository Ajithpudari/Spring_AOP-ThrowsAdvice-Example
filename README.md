# Spring_AOP-ThrowsAdvice-Example
Aspect Oriented Programming (AOP) compliments OOPs in the sense that it also provides modularity. But the key unit of modularity is aspect than class.

AOP breaks the program logic into distinct parts (called concerns). It is used to increase modularity by cross-cutting concerns.

The @AfterThrowing is a Spring AOP advice. Advices in Aspect Oriented Programming encapsulate some of the cross cutting concerns, so that the target classes can focus on the primary functionality.

As the name denotes, AfterThrowing advice executes when the target method throws an exception. It won’t run if the method finishes successfully, or the method swallows the thrown exception. Thus, the AfterThrowing advice is useful, when for an application we want to build a common exception handler that can catch a different exceptions thrown by a different target methods and takes an action.

### After Throwing Advice class which implements ThrowsAdvice interface. 

```
public class CatchThroughException implements ThrowsAdvice {

    public void afterThrowing(NullPointerException e) throws Throwable {
        System.out.println("Inside CatchThrowException.afterThrowing() method...");
        System.out.println("Running after throwing exception...");
    }
}
```
### OUTPUT:

```
Inside CatchThrowException.afterThrowing() method...
Running after throwing exception...

Process finished with exit code 0
```
