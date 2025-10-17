package 조건문;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요(cm) : ");
        int k = sc.nextInt();

        System.out.print("몸무게를 입력하세요(kg) : ");
        int kg = sc.nextInt();

        double height = (double) k / 100;
        double bmi = kg / (height * height);

        System.out.printf("당신의 BMI는 %.2f 입니다.%n", bmi);

        if (bmi < 18.5) System.out.println("저체중 입니다");
        else if (bmi < 23) System.out.println("정상 체중입니다");
         else if (bmi < 25) System.out.println("과체중 입니다");
         else System.out.println("비만 입니다");

    }
}
