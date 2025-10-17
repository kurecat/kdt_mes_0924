package 매쓰응용문제;

import java.util.Scanner;

public class MathExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        double score = sc.nextDouble();
        System.out.println("내림floor : " + Math.floor(score));
        System.out.println("올림ceil : " + Math.ceil(score));
        System.out.println("반올림round : " + Math.round(score));
        // 수학적인 연산을 통해서 구하기
        System.out.println("소수점 두번째 자리 출력 : " + Math.round(score * 100) / 100.0);
        // 서식 지정자를 사용하는 방법
        System.out.printf("소수점 두번째 자리 출력 : %.2f\n",score);
    }

}
