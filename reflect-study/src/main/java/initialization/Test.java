package initialization;

/**
 * @Author ketty bluce
 * @Create 2023/4/21
 * @Version 1.0
 */
public class Test {

    static int b = 9;
    static {
        b = 6;
        System.out.println("-------------------");
    }

    static int a = 5;

    static int c;

    @org.junit.Test
    public void test1() {
        System.out.println(Test.b);

    }
}
