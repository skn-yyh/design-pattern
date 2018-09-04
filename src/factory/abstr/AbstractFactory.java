package factory.abstr;

import factory.entity.Computer;

/**
 * @ClassName: AbstractFactory
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:29
 */
public abstract class AbstractFactory {
    public abstract Computer getAsus();
    public abstract Computer getMacPro();
    public abstract Computer getAlienware();
}
