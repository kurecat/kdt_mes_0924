package for반복문;
// 범위 기반 for : for(초기값; 최종값; 증감값)

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0; // 지역 변수를 만들고 0으로 초기화
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++ ) {
            total += i; // total = total + i
        }


        System.out.println(total);
    }
}