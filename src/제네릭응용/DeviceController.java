package 제네릭응용;

public class DeviceController<T extends Device>{
    private T device;

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }

    public void setDevice(T device) {
        this.device = device; // set < 정하는거?
    }

    @Override
    public String toString() {
        return device.toString();
    }
}

