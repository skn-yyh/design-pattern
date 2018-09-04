package factory.simple;

/**
 * @ClassName: TestDemo
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:14
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getComputer("Asus"));
        System.out.println(factory.getComputer("MacPro"));
        System.out.println(factory.getComputer("Alienware"));
        System.out.println(factory.getComputer("Lenovo"));
    }
}
