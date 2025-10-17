package 제네릭응용;

public class Printer extends Device{
    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public String toString() {
        return "프린트 ";
    }
}

class Monitor extends Device{
    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public String toString() {
        return "모니터 ";
    }
}

class KeyBoard extends Device {
    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public String toString() {
        return "키보드 ";
    }
}