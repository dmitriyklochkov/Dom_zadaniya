package Computer;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private GraphicsСard graphicsСard;
    private StorageDevice storageDevice;
    private Monitor monitor;

    ComputerFacade() {
        this.cpu = new CPUFactory();
        this.memory = new MemoryFactory();
        this.graphicsСard = new GraphicsСardFactory();
        this.storageDevice = new StorageDeviceFactory();
        this.monitor = new MonitorFactory();
    }

    void start() {
        cpu.start();
        cpu.getInfo();
        memory.start();
        memory.getInfo();
        graphicsСard.start();
        graphicsСard.getInfo();
        storageDevice.start();
        storageDevice.getInfo();
        monitor.start();
        monitor.getInfo();
    }
}
