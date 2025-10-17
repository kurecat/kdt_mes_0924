package for실습;

import java.util.Scanner;

public class ForExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int total = 0;
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
