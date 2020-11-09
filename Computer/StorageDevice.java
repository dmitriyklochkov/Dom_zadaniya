package Computer;

public class StorageDevice implements Component {
    protected double formFactor;
    protected String manufacturer;
    protected String type;
    protected int volume;

    @Override
    public void start() {
        System.out.println("накопитель включен");
    }

    @Override
    public void getInfo() {

    }
}
