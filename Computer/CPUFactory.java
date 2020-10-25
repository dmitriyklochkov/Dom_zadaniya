package Computer;

public class CPUFactory extends CPU {
    @Override
    public void getInfo() {

        CPU cpu = new CPU();
        if (Computer.strategiy == 0) {
            cpu.frequency = 1000;
            cpu.core = 1;
            cpu.cash = 1;
            cpu.manufacturer = "AMD";
            cpu.name = "Ryzen";
            System.out.println("процессор: " + cpu.name + " ,производитель " + cpu.manufacturer + ", " + cpu.frequency + " Гц тактовая частота, " + cpu.cash + " Гб кеш, ядер " + cpu.core);

        } else {
            cpu.frequency = 3400;
            cpu.core = 4;
            cpu.cash = 2;
            cpu.manufacturer = "Intel";
            cpu.name = "icore7";
            System.out.println("процессор: " + cpu.name + " ,производитель " + cpu.manufacturer + ", " + cpu.frequency + " Гц тактовая частота, " + cpu.cash + " Гб кеш, ядер " + cpu.core);
        }
    }
}