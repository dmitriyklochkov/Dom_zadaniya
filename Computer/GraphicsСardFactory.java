package Computer;

public class GraphicsСardFactory extends GraphicsСard {
    @Override
    public void getInfo() {
        GraphicsСard graphicsСard = new GraphicsСard();
        if (Computer.strategiy == 0) {
            graphicsСard.type = "дискретная";
            graphicsСard.cooling = "пассивное";
            graphicsСard.volume = 1;
            graphicsСard.manufacturer = "Gigabyte";
            System.out.println("видеокарта: производитель " + graphicsСard.manufacturer + ", охлаждение " + graphicsСard.cooling + ", " + graphicsСard.type + " , объем памяти " + graphicsСard.volume + " Гб ");

        } else {
            graphicsСard.type = "интегрированная";
            graphicsСard.cooling = "активное";
            graphicsСard.volume = 2;
            graphicsСard.manufacturer = "Asus";
            System.out.println("видеокарта: производитель " + graphicsСard.manufacturer + ", охлаждение " + graphicsСard.cooling + ", " + graphicsСard.type + " , объем памяти " + graphicsСard.volume + " Гб ");

        }
    }
}