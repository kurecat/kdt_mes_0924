package 정적멤버;

import java.util.Scanner;

public class Bank {
    private static int count = 0; // 생성된 계좌의 총 개수
    private int account;  // 계좌 잔액 (private으로 변경하여 외부에서 직접 수정 방지)
    String bankName; // 은행 이름

    // 생성자: 객체를 만들 때 호출됨
    public Bank(String bankName, int account) {
        count++;
        this.bankName = bankName;
        this.account = account;
        System.out.println(this.bankName + "은행에 계좌를 개설합니다. 현재 잔액은 " + this.account + "원 입니다.");
    }

    // 정적(static) 메소드: 생성된 총 계좌 수를 반환
    public static int getCount() {
        return count;
    }

    // 예금하기 (Scanner를 파라미터로 받음)
    public void setDeposit(Scanner sc) {
        System.out.print("예금할 금액을 입력하세요: ");
        final int dep = sc.nextInt();
        this.account += dep;
        System.out.println(dep + "원을 예금 했습니다.");
        System.out.println("현재 잔액: " + this.account);
    }

    // 출금하기 (Scanner를 파라미터로 받음)
    public void setWithdraw(Scanner sc) {
        System.out.print("출금할 금액을 입력하세요: ");
        final int with = sc.nextInt();
        if (with > this.account) { // 먼저 잔액이 충분한지 확인
            System.out.println("잔액이 부족합니다.");
        } else {
            this.account -= with; // 잔액이 충분할 때만 출금
            System.out.println(with + "원을 출금했습니다.");
            System.out.println("현재 잔액: " + this.account);
        }
    }

    // 잔액 확인
    public void viewAccount() {
        System.out.println(this.bankName + "의 현재 잔액은 " + this.account + "원 입니다.");
    }

    // 계좌 관리 메뉴 (Scanner를 파라미터로 받음)
    public void manageAccount(Scanner sc) {
        while (true) {
            System.out.println("\n[" + this.bankName + " 은행 메뉴]");
            System.out.println("[1] 예금 [2] 출금 [3] 잔액 확인 [4] 뒤로가기");
            System.out.print(">> 메뉴 선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    setDeposit(sc);
                    break;
                case 2:
                    setWithdraw(sc);
                    break;
                case 3:
                    viewAccount();
                    break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return; // manageAccount 메소드 종료
                default:
                    System.out.println("오류: 잘못된 메뉴를 선택하셨습니다.");
                    break;
            }
        }
    }
}