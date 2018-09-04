package factory.abstr;

import factory.entity.Alienware;
import factory.entity.Asus;
import factory.entity.Computer;
import factory.entity.MacPro;

/**
 * @ClassName: ComputerFactory
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:33
 */
public class ComputerFactory extends AbstractFactory {
    @Override
    public Computer getAsus() {
        return new Asus();
    }

    @Override
    public Computer getMacPro() {
        return new MacPro();
    }

    @Override
    public Computer getAlienware() {
        return new Alienware();
    }
}
