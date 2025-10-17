package 추상클래스기본;

public abstract class Phone {
    String name;
    boolean isPower;
    public Phone(String name) {
        this.name = name;
        isPower = false;
    }

    public void setPower(boolean power) {
        this.isPower = power;
        System.out.println("Phone power " + (power ? "ON" : "OFF"));
    }
    abstract void call();
    abstract void store();
}
