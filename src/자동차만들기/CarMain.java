package 자동차만들기;

import java.util.Scanner;

import static 자동차만들기.Common.DISTANCE;

public class CarMain {
    public static void main(String[] args) {
        Car car; // Car 추상클래스에 대한 참조 변수 생성하고 null로 초기화
        InputHandler in = new InputHandler();
        int loc = in.getLocation();     // 이동 지역 입력
        int cnt = in.getPassengerCnt(); // 승객 수 입력
        int type = in.getCarType();     // 자동차 선택
        boolean isMode = in.getOptionMode(); // 부가 기능
        int weather = in.getWeather();  // 날씨 선택
        Scanner sc = new Scanner(System.in);
        int audioonoff = 0;
        int airConOnOff = 0;
        int autopilotOnOff = 0;

        switch (type) {
            case 1:
                car = new SportCar("람보르기니");
                break;
            case 2:
                car = new Sedan("Genesis G80");
                break;
            case 3:
                car = new Bus("관광버스");
                break;
            default:
                car = null;
        }

        if (car instanceof AirConInterFaceMain ac) {
            airConOnOff = in.getOption("에어컨");
            if (airConOnOff == 1) car.fuelEff /= AirConInterFaceMain.aircon;
        }
        if (car instanceof AutoPilotIntFaceMain) {
            autopilotOnOff = in.getOption("자율주행");
            if (autopilotOnOff == 1) car.maxSpeed /= AutoPilotIntFaceMain.autopilot;
        }
        if (car instanceof AudioInterFaceMain) {
            audioonoff = in.getOption("오디오");
        }

        car.setMode(isMode);  // 부가 기능 설정, 상속 받은 자동차의 메서드가 동작
        int moveCnt = car.getMovingCnt(cnt);

        System.out.println("=".repeat(8) + car.getName() + "=".repeat(8));
        System.out.println("총 비용 : " + car.getTotalCost(DISTANCE[loc], moveCnt) + "원");
        System.out.println("주유 횟수 : " + car.getRefuelCnt(DISTANCE[loc], moveCnt) + "회");
        System.out.println("이동 시간 : " + car.getMovingTime(DISTANCE[loc], moveCnt, weather));
        if (car instanceof AirConInterFaceMain ac) if (airConOnOff == 1) ac.AirOn();
        else ac.AirOff();
        if (car instanceof AutoPilotIntFaceMain ap) if (autopilotOnOff == 1) ap.autoPilotOn();
        else ap.autoPilotOff();
        if (car instanceof AudioInterFaceMain ad) if (audioonoff == 1) ad.AudioOn();
        else ad.AudioOff();
    }
}
