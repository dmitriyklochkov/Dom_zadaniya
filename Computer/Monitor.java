package Computer;

public class Monitor implements Component {

    protected String name;
    protected int diagonal;

    @Override
    public void start() {
        System.out.println("монитор включен");
    }

    @Override
    public void getInfo() {

    }
}


