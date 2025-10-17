package for실습;

import java.util.Scanner;

public class ForEee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int count = 0;
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            if(i % 5 == 0) {
                System.out.printf("%5d", i);
                count++;

                if(count % 10 == 0) System.out.println();
            }
        }
    }
}