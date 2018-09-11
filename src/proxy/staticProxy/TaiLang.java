package proxy.staticProxy;

public class TaiLang implements IPerson {
    private String name;

    public TaiLang() {}

    public TaiLang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void findJob() {
        System.out.println(this.name + "要找工作...");
        System.out.println(this.name + "要一份年薪30W的工作。");
    }
}
