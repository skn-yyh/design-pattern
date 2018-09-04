package factory.entity;

/**
 * @ClassName: Asus
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:08
 */
public class Alienware implements Computer {
    @Override
    public String getBrand() {
        return "Computer: Alienware";
    }

    @Override
    public String toString() {
        return "Alienware";
    }
}
