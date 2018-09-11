package proxy.jdkProxy;

public class JDKProxyTest {
    public static void main(String[] args) throws Exception {
        IPerson obj = (IPerson) new LianJia().getInstance(new TaiLang());
        obj.findHouse();
    }
}
