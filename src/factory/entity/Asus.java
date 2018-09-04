package factory.entity;

/**
 * @ClassName: Asus
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:08
 */
public class Asus implements Computer {
    @Override
    public String getBrand() {
        return "Computer: Asus";
    }

    @Override
    public String toString() {
        return "Asus";
    }
}
