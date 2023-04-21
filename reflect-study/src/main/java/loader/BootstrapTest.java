package loader;

import org.junit.Test;
import sun.misc.Launcher;

import java.net.URL;

/**
 * @Author ketty bluce
 * @Create 2023/4/21
 * @Version 1.0
 */
public class BootstrapTest {

    @Test
    public void test1() {
        // 获取根类加载器所加载的所有的全部URL的数组
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        // 遍历，输出根类加载器所有的URL
        for (URL urL : urLs) {

            System.out.println(urL.toExternalForm());

        }


    }
}
