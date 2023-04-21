package initialization;

import org.junit.Test;

public class ClassLoaderTest {

    @Test
    public void test() throws Exception {
        // 获取到类加载器
        ClassLoader cl = ClassLoader.getSystemClassLoader();

        cl.loadClass("initialization.Tester");

        System.out.println("系统加载Tester类");

        Class.forName("initialization.Tester");

    }

}
