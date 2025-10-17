package 자동차만들기;

import java.util.Scanner;

public class InputHandler {
    Car car;
    private final Scanner sc = new Scanner(System.in);
    // 이동 지역 선택
    public int getLocation() {
        int loc;
        while (true) {
            System.out.print("이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            loc = sc.nextInt();
            if (loc >= 1 && loc <= 4) return loc;
            System.out.println("이동할 지역 선택이 잘 못 되었습니다.");
        }
    }

    // 승객 수 입력
    public int getPassengerCnt() {
        int cnt;
        while (true) {
            System.out.print("이동할 승객 수 입력(1 ~ 100) : ");
            cnt = sc.nextInt();
            if (cnt >= 1 && cnt <= 100) return cnt;
            System.out.println("승객 수는 1 ~ 100 사이여야 합니다.");
        }
    }

    // 차량 종류 선택
    public int getCarType() {
        int type;
        while (true) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            type = sc.nextInt();
            if(type >= 1 && type <= 3) return type;
            System.out.println("차량 선택이 잘 못 되었습니다.");
        }
    }

    // 부가 기능 선택
    public  boolean getOptionMode() {
        int option;
        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            option = sc.nextInt();
            if(option == 1 || option == 2) return option == 1;
            System.out.println("모드 선택이 잘 못 되었습니다.");
        }
    }

    // 날씨 선택
    public int getWeather() {
        int weather;
        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [2]눈 : ");
            weather = sc.nextInt();
            if (weather >= 1 && weather <= 3) return weather;
            System.out.println("날씨 선택이 잘 못 되었습니다.");
        }
    }

    public int getOption(String optionName) {
        int choice;
        while (true) {
            // 전달받은 optionName을 출력문에 사용합니다.
            System.out.printf("%s [1]ON [2]OFF : ", optionName);
            choice = sc.nextInt();
            if (choice == 1 || choice == 2) {
                return choice; // 1 또는 2를 입력하면 값을 반환하고 종료
            }
            System.out.println("옵션을 다시 선택해 주세요.");
        }
    }
}
