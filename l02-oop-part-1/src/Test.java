import java.util.Date;

public class Test {

    static {
        System.out.println("Static");
    }

    {
        System.out.println("Non-static");
    }

    public static void doWork(){}

}
