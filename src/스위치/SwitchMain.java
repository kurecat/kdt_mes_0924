package 스위치;
// switch 문 : 조건문의 일종, if문은 조건식이 올 수 있지만, 조건식이 올 수 없고, 값만 올 수 있음
// 조건의 값으로는 정수, 문자, 문자열이 올 수 있고, 실수는 안됨
// 조건에 대한 수행이후 반드시 break 문이 필요

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 계절 입력 : ");
        String season = sc.next().toLowerCase(); // 입력 받은 문자열을 소문자로 변경해서 대입
        switch (season) { // 조건값
            case "spring":
                System.out.println("하린씨가 좋은 봄이 왔어요~~~");
                break; // 탈출문
            case "summer":
                System.out.println("여름 휴가가 기다려지는 여름 입니다.");
                break;
            case "fall":
            case "autumn":
                System.out.println("남자들이 좋아하는 가을 입니다~~~");
                break;
            case "winter":
                System.out.println("추운 겨울 입니다.");
                break;
            default: // 위의 모든 조건을 만족하지 않은 경우 수행 됨
                System.out.println("계절을 잘 못 입력 하셨습니다.");
        }
    }
}
