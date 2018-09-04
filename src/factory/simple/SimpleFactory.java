package factory.simple;

import factory.entity.Alienware;
import factory.entity.Asus;
import factory.entity.Computer;
import factory.entity.MacPro;

/**
 * @ClassName: SimpleFactory
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:10
 */
public class SimpleFactory {

    public Computer getComputer(String brand) {

        if ("Asus".equals(brand)) {
            return new Asus();
        } else if ("MacPro".equals(brand)) {
            return new MacPro();
        } else if ("Alienware".equals(brand)) {
            return new Alienware();
        } else {
            System.out.println("抱歉！没有该品牌。");
            return null;
        }

    }
}
