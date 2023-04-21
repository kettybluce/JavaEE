package classloding;

import org.junit.Test;

/**
 * @Author ketty bluce
 * @Create 2023/4/21
 * @Version 1.0
 */
public class ATest1 {
    @Test
    public void test1() {
        // 创建A的实例
        A a = new A();
        // 让a变量的a值自增
        a.a++;
        System.out.println(a.a);
    }
}
