package Computer;

public class MonitorFactory extends Monitor {
    @Override
    public void getInfo() {

        Monitor monitor = new Monitor();
        if (Computer.strategiy == 0) {
            monitor.name = "Accer";
            monitor.diagonal = 17;
            System.out.println("монитор: " + monitor.name + " , диагональ " + monitor.diagonal);

        } else {
            monitor.name = "Samsung";
            monitor.diagonal = 22;
            System.out.println("монитор: " + monitor.name + " , диагональ " + monitor.diagonal);

        }
    }
}