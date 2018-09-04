package factory.func;

import factory.entity.Alienware;
import factory.entity.Asus;
import factory.entity.Computer;

/**
 * @ClassName: AsusFactory
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:24
 */
public class AlienwareFactory implements Factory {
    @Override
    public Computer getComputer() {
        return new Alienware();
    }
}
