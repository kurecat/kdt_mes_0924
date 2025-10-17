package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CocoaTok cocoaTok;
        NetAdapter adapter;
        System.out.print("네트워크 선택 [1]WIFI [2]5G [3]LTE : ");
        int choice = sc.nextInt();

        // adapter에 연결할 네트워크 객체 주소를 대입
        switch (choice){
            case 1: adapter = new wiFi(); break;
            case 2: adapter = new FiveG(); break;
            case 3: adapter = new Lte(); break;
            default: adapter = null;
        }
        // 코코아톡 객체 생성
        cocoaTok = new CocoaTok("한기전 ", adapter);

        // 메세지 작성 메서드 호출
        cocoaTok.writeMsg("ㅎㅇ");

        // 메시지 전송
        cocoaTok.send();
    }
}
