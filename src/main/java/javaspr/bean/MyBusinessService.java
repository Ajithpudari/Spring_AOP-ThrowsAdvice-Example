package javaspr.bean;

public class MyBusinessService {

    public void runMyBusinessLogic() {
        System.out.println("Running business logic...");
    }
    public void testThrowException() {
        throw new NullPointerException();
    }
}