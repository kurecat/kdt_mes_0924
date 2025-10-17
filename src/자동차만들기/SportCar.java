package 자동차만들기;

public class SportCar extends Car implements AirConInterFaceMain,AudioInterFaceMain{

    public SportCar(String name) {
        super(250, 8, 30, 2, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }

    @Override
    public void AirOn() {
        System.out.println("에어컨 : ON");
    }

    @Override
    public void AirOff() {
        System.out.println("에어컨 : OFF");
    }

    @Override
    public void AudioOn() {
        System.out.println("오디오 : ON");
    }

    @Override
    public void AudioOff() {
        System.out.println("오디오 : OFF");
    }
}

class Sedan extends Car implements AirConInterFaceMain, AudioInterFaceMain, AutoPilotIntFaceMain{

    public Sedan(String name) {
        super(200, 12, 45, 4, name);
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }

    @Override
    public void AirOn() {
        System.out.println("에어컨 : ON");

    }

    @Override
    public void AirOff() {
        System.out.println("에어컨 : OFF");
    }

    @Override
    public void AudioOn() {
        System.out.println("오디오 : ON");
    }

    @Override
    public void AudioOff() {
        System.out.println("오디오 : OFF");
    }

    @Override
    public void autoPilotOn() {
        System.out.println("오토파일럿 : ON");
    }

    @Override
    public void autoPilotOff() {
        System.out.println("오토파일럿 : OFF");
    }

}

class Bus extends Car implements AirConInterFaceMain, AutoPilotIntFaceMain{

    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelTank += 30;
    }

    @Override
    public void AirOn() {
        System.out.println("에어컨 : ON");
    }

    @Override
    public void AirOff() {
        System.out.println("에어컨 : OFF");
    }

    @Override
    public void autoPilotOn() {
        System.out.println("오토파일럿 : ON");
    }

    @Override
    public void autoPilotOff() {
        System.out.println("오토파일럿 : OFF");
    }

}