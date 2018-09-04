package factory.abstr;

/**
 * @ClassName: AbstractFactoryTest
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:34
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        System.out.println(factory.getAsus());
        System.out.println(factory.getMacPro());
        System.out.println(factory.getAlienware());
    }
}
