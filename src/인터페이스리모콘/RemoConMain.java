package 인터페이스리모콘;
// 인터페이스 : 클래스가 구현해야 할 메서드들의 설계명세
// - "이런 기능을 제공해야 한다."는 규칙 또는 약속을 정의
// - 이를 통해 다양한 클래스 동일한 기능을 일관된 형식으로 구현 할 수 있음.
// - 자바는 클래스의 다중 상속을 허용하지 않지만, 인터페이스는 다중 구현이 가능.
// 둘다 객체를 못만듬,
// 인터페이스 = 다중 상속이 가능함.
// 추상 클래스 = 한가지만 상속가능.

// RemoteControl 인터페이스를 상속받아 Audio 클래스 생성
// RemoteControl 인터페이스를 상속받아 PS4 클래스 생성
// RemoteControl 인터페이스를 상속받아 Computer 클래스 생성

import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {
        // 제품을 선택 하세요 [1]Audio [2]PS4 [3]Computer 기능을 추가해서 리모컨 기능을 동작시키기.
        RemoteControl remoteControl; // RemoteControl 인터페이스에 대한 참조 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("제품을 선택 하세요 [1]Audio [2]PS4 [3]Computer");
        System.out.print("선택 : ");
        int ch = sc.nextInt();
        remoteControl = switch (ch) {
            case 1 -> new Audio();
            case 2 -> new PS4();
            case 3 -> new Computer();
            default -> null;
        };
        remoteControl.turnOn();
        remoteControl.setVolume(35);
        remoteControl.setMute(false);

        RemoteControl carAudio = new RemoteControl() {
            private int volume;
            @Override
            public void turnOn() {
                System.out.println("차량 오디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("차량 오디오를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIX_VOLUME) {
                    this.volume = RemoteControl.MIX_VOLUME;
                } else {
                    this.volume = volume;
                }
            }
        };
        carAudio.turnOn();
        carAudio.setVolume(20);
    }
}
