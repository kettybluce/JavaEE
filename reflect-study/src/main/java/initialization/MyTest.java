package initialization;

import org.junit.Test;

/**
 * @Author ketty bluce
 * @Create 2023/4/21
 * @Version 1.0
 */
public class MyTest {

    static {
        System.out.println("静态代码块。。。。");
    }

    // System.currentTimeMillis() + "";
    static final String compileConstant = "疯狂的麦克斯！！！";

    @Test
    public void test() {
        System.out.println(MyTest.compileConstant);
    }
}
