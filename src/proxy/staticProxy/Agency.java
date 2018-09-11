package proxy.staticProxy;

public class Agency implements IPerson {
    private IPerson person;

    public Agency() {
        this.person = new TaiLang("TL");
    }

    @Override
    public void findJob() {
        person.findJob();
        System.out.println("找到了年薪30W的工作！！！");
    }
}
