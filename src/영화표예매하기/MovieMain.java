package 영화표예매하기;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // TODO : 좌석당 가격을 생성자로 전달해서 객체 생성
        MovieTicket ticketSystem = new MovieTicket(12000);

        // TODO : 스캐너 객체 생성하기
        Scanner sc = new Scanner(System.in);

        // TODO : while 반복문 생성 [1]예매하기 [2]취소하기 [3]종료하기
        while (true) {
            System.out.println("=".repeat(30));
            System.out.println("\n[1] 예매하기 [2] 취소하기 [3] 총 매출 확인 및 종료");
            System.out.print(">> 메뉴 선택 : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // MovieTicket 클래스의 예매 메서드 호출
                    ticketSystem.reserveSeat();
                    break;
                case 2:
                    // MovieTicket 클래스의 취소 메서드 호출
                    ticketSystem.cancelSeat();
                    break;
                case 3:
                    // MovieTicket 클래스의 총 판매액 출력 메서드 호출
                    ticketSystem.printTotalSales();
                    System.out.println("프로그램을 종료합니다.");
                    sc.close(); // Scanner 리소스 정리
                    return; // main 메서드를 종료하여 프로그램 완전 종료
                default:
                    System.out.println("오류: 잘못된 메뉴를 선택하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}