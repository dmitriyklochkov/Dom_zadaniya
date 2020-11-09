package Computer;

public class GraphicsСard implements Component {
    protected String manufacturer;
    protected String type;
    protected int volume;
    protected String cooling;

    @Override
    public void start() {
        System.out.println("видеокарта включена");
    }

    @Override
    public void getInfo() {

    }
}
