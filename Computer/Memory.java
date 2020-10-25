package Computer;

public class Memory implements Component {
    protected int volume;
    protected String type;
    protected int frequency;
    protected String manufacturer;

    @Override
    public void start() {
        System.out.println("ОЗУ включено");
    }

    @Override
    public void getInfo() {
    }
}
