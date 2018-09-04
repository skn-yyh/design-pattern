package factory.func;

import factory.entity.Asus;
import factory.entity.Computer;
import factory.entity.MacPro;

/**
 * @ClassName: AsusFactory
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:24
 */
public class MacProFactory implements Factory {
    @Override
    public Computer getComputer() {
        return new MacPro();
    }
}
