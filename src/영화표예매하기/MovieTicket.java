package 영화표예매하기;

import java.util.Scanner;

public class MovieTicket {
    // TODO : 좌석 10개에 대한 배열 생성, seat의 주소 변경을 막기 위해 final 지정.
    private final int[] seat;

    // TODO : 좌석당 가격을 받기위한 인스턴스 필드 생성
    private final int pricePerSeat;

    // TODO : 입력용 스캐너 생성
    private final Scanner sc;

    // TODO : 생성자를 만들고 가격을 주입(매개변수) 받음
    public MovieTicket(int pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
        sc = new Scanner(System.in);
        seat = new int[10]; // heap 영역에 배열을 할당하면 자동 초기화 됨 (자바)
        System.out.println("====== 영화표 예매 시스템 ======");
        System.out.println("좌석당 가격: " + this.pricePerSeat + "원");
    }

    // TODO : 좌석 예매 메서드
    public void reserveSeat() {
        System.out.println("\n===== 좌석 예매 =====");
        displaySeats(); // 현재 좌석 상태 보여주기

        System.out.print("예매할 좌석 번호(1-10)를 입력하세요: ");
        int seatNum = sc.nextInt();

        // 사용자가 입력한 좌석 번호(1-10)를 배열 인덱스(0-9)로 변환
        int seatIndex = seatNum - 1;

        // 좌석 번호 유효성 검사
        if (seatIndex < 0 || seatIndex >= seat.length) {
            System.out.println("오류: 좌석 번호는 1에서 10 사이여야 합니다.");
            return;
        }

        // 이미 예매된 좌석인지 확인
        if (seat[seatIndex] == 1) {
            System.out.println("알림: 이미 예매된 좌석입니다. 다른 좌석을 선택해주세요.");
        } else {
            seat[seatIndex] = 1; // 예매 처리
            System.out.println("✔ " + seatNum + "번 좌석이 예매되었습니다.");
        }
        displaySeats(); // 변경된 좌석 상태 보여주기
    }

    // TODO : 좌석 취소 메서드
    public void cancelSeat() {
        System.out.println("\n===== 좌석 취소 =====");
        displaySeats(); // 현재 좌석 상태 보여주기

        System.out.print("취소할 좌석 번호(1-10)를 입력하세요: ");
        int seatNum = sc.nextInt();
        int seatIndex = seatNum - 1;

        // 좌석 번호 유효성 검사
        if (seatIndex < 0 || seatIndex >= seat.length) {
            System.out.println("오류: 좌석 번호는 1에서 10 사이여야 합니다.");
            return;
        }

        // 예매된 좌석인지 확인
        if (seat[seatIndex] == 0) {
            System.out.println("알림: 아직 예매되지 않은 좌석입니다.");
        } else {
            seat[seatIndex] = 0; // 취소 처리
            System.out.println("✔ " + seatNum + "번 좌석 예매가 취소되었습니다.");
        }
        displaySeats(); // 변경된 좌석 상태 보여주기
    }

    // TODO : 종료하기 선택 시 총 매출액 보여주기
    public void printTotalSales() {
        int reservedCount = 0;
        // 향상된 for문으로 배열의 모든 요소를 순회
        for (int reservationStatus : seat) {
            if (reservationStatus == 1) { // 좌석이 예매된 상태(1)이면
                reservedCount++;
            }
        }
        int totalSales = reservedCount * this.pricePerSeat;
        System.out.println("===========================");
        System.out.println("총 판매액: " + totalSales + "원");
        System.out.println("===========================");
    }

    // [헬퍼 메서드] 현재 좌석 상태를 시각적으로 보여주는 기능
    private void displaySeats() {
        System.out.println("-----------------------------------------");
        for (int i = 0; i < seat.length; i++) {
            System.out.print((i + 1) + "  "); // 좌석 번호 (1-10)
        }
        System.out.println("\n-----------------------------------------");
        for (int s : seat) {
            if (s == 0) {
                System.out.print("□  "); // □: 빈 좌석
            } else {
                System.out.print("■  "); // ■: 예매된 좌석
            }
        }
        System.out.println("\n");
    }

    // [헬퍼 메서드] 전체 프로그램을 실행하는 기능
    public void run() {
        while (true) {
            System.out.println("\n[1] 예매 [2] 취소 [3] 총 매출 확인 및 종료");
            System.out.print(">> 메뉴 선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    reserveSeat();
                    break;
                case 2:
                    cancelSeat();
                    break;
                case 3:
                    printTotalSales();
                    System.out.println("프로그램을 종료합니다.");
                    sc.close(); // Scanner 리소스 정리
                    return; // run 메서드 종료
                default:
                    System.out.println("오류: 잘못된 메뉴를 선택하셨습니다.");
                    break;
            }
        }
    }
}