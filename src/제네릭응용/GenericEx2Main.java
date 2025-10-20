package 제네릭응용;

import java.util.Scanner;

public class GenericEx2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("기기 선택 [1]키보드 [2]모니터 [3]프린트");
        System.out.print("선택 : ");
        int c = sc.nextInt();
        System.out.println("=".repeat(20));
            switch (c) {
                case 1:
                    DeviceController<KeyBoard> keyBoardDeviceController = new DeviceController<>();
                    keyBoardDeviceController.setDevice(new KeyBoard());
                    System.out.print(keyBoardDeviceController);
                    keyBoardDeviceController.powerOn();
                    System.out.print(keyBoardDeviceController);
                    keyBoardDeviceController.powerOff();
                    break;

                case 2:
                    DeviceController<Monitor> monitorDeviceController = new DeviceController<>();
                    monitorDeviceController.setDevice(new Monitor());
                    System.out.print(monitorDeviceController);
                    monitorDeviceController.powerOn();
                    System.out.print(monitorDeviceController);
                    monitorDeviceController.powerOff();
                    break;

                case 3:
                    DeviceController<Printer> printerDeviceController = new DeviceController<>();
                    printerDeviceController.setDevice(new Printer());
                    System.out.print(printerDeviceController);
                    printerDeviceController.powerOn();
                    System.out.print(printerDeviceController);
                    printerDeviceController.powerOff();
                    break;
                default:
                    System.out.println("기기 선택이 잘 못 되었습니다.");

            }
        }
}
