package Computer;

public class StorageDeviceFactory extends StorageDevice {
    @Override
    public void getInfo() {
        StorageDevice storageDevice = new StorageDevice();
        if (Computer.strategiy == 0) {
            storageDevice.type = "HDD";
            storageDevice.volume = 128;
            storageDevice.manufacturer = "Seagate";
            storageDevice.formFactor = 2.5;
            System.out.println("накопитель: производитель " + storageDevice.manufacturer + ", тип " + storageDevice.type + ", форм фактор " + storageDevice.formFactor + " , объем памяти " + storageDevice.volume + " Гб ");

        } else {
            storageDevice.type = "SSD";
            storageDevice.volume = 1024;
            storageDevice.manufacturer = "WD";
            storageDevice.formFactor = 3.5;
            System.out.println("накопитель: производитель " + storageDevice.manufacturer + ", тип " + storageDevice.type + " , форм фактор " + storageDevice.formFactor + " , объем памяти " + storageDevice.volume + " Гб ");

        }
    }
}