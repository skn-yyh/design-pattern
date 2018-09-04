package factory.func;

/**
 * @ClassName: FactoryTest
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:25
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory;

        factory = new AsusFactory();
        System.out.println(factory.getComputer());

        factory = new MacProFactory();
        System.out.println(factory.getComputer());

        factory = new AlienwareFactory();
        System.out.println(factory.getComputer());
    }
}
