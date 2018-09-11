package proxy.staticProxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        IPerson agency = new Agency();
        agency.findJob();
    }
}
