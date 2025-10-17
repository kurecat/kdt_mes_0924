package 정적멤버;
// static : 정적 멤버(필드) 및 메서드를 만들 때 사용, 클래스 생성 시 함께 생성되고, 객체 생성 시 생성되지 않음.
// 은행을 5개 만들고 각각에 대해서 입금, 출금, 조회 기능 구현
// Bank 클래스를 객체가 몇개 생성되었는지를 확인하기 위해서 정적 메서드 호출해서 결과 확인하기

import java.util.Scanner;

public class StaticMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] banks = new Bank[5];
        banks[0] = new Bank("카카오", 0);
        banks[1] = new Bank("신한", 0);
        banks[2] = new Bank("기업", 0);
        banks[3] = new Bank("토스뱅크", 0);
        banks[4] = new Bank("농협", 0);

        while (true) {
            System.out.println("\n========== 은행을 선택하세요 ==========");
            for (int i = 0; i < banks.length; i++) {
                // (i + 1)을 해주는 이유는 사용자가 보기 편하게 1번부터 시작하기 위함
                System.out.println((i + 1) + ". " + banks[i].bankName);
            }
            System.out.println((banks.length + 1) + ". 프로그램 종료");
            System.out.print(">> 선택: ");
            int choice = sc.nextInt();

            // 종료 옵션을 선택한 경우
            if (choice == banks.length + 1) {
                System.out.println("프로그램을 종료합니다.");
                break; // while 반복문 탈출
            }

            // 유효한 은행 번호를 선택한 경우 (1 ~ 5)
            if (choice >= 1 && choice <= banks.length) {
                // 사용자는 1번을 눌렀지만, 배열의 인덱스는 0번이므로 choice - 1을 해줌
                banks[choice - 1].manageAccount(sc);
            } else {
                System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
            }
        }
        sc.close();
    }
}