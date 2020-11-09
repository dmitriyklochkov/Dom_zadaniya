package Computer;

public class MemoryFactory extends Memory {
    @Override
    public void getInfo() {

        Memory memory = new Memory();
        if (Computer.strategiy == 0) {
            memory.volume = 1;
            memory.type = "DDR1";
            memory.frequency = 333;
            memory.manufacturer = "IBM";
            System.out.println("ОЗУ: " + "тип " + memory.type + ", производитель " + memory.manufacturer + ", " + memory.frequency + " Гц тактовая частота, объем " + memory.volume + " Гб");

        } else {
            memory.frequency = 4000;
            memory.volume = 16;
            memory.type = "DDR4";
            memory.manufacturer = "Kingston";
            System.out.println("ОЗУ: " + "тип " + memory.type + ", производитель " + memory.manufacturer + ", " + memory.frequency + " Гц тактовая частота, объем " + memory.volume + " Гб");

        }
    }
}

