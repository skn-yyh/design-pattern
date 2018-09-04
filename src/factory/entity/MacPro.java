package factory.entity;

/**
 * @ClassName: Asus
 * @Description: TODO
 * @Author: skn-yyh
 * @Date: 2018/9/4 17:08
 */
public class MacPro implements Computer {
    @Override
    public String getBrand() {
        return "Computer: MacPro";
    }

    @Override
    public String toString() {
        return "MacPro";
    }
}
