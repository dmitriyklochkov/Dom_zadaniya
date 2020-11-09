package Computer;

public class CPU implements Component {
    protected int frequency;
    protected int core;
    protected int cash;
    protected String manufacturer;
    protected String name;

    @Override
    public void start() {
        System.out.println("процессор включен");
    }

    @Override
    public void getInfo() {
    }
}

