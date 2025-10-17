package 동적다형성실습;


import java.util.Scanner;

public class PolyEx2Main {
    public static void main(String[] args) {
        Manager manager = new Manager("장원영");
        Scanner sc = new Scanner(System.in);
        System.out.print("배송 시스템 선택 [1]택배 배송 [2]쿽 배송 [3]항공 배송 : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: manager.send(new ParcelDelivery("CJ대한통운")); break;
            case 2: manager.send(new QuickDelivery("쿠팡로켓배송")); break;
            case 3: manager.send(new AirDelivery("FedEx")); break;
            default: System.out.println("배송 시스템을 잘 못 선택 하셨습니다.");
        }
    }
}