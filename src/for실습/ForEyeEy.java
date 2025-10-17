package for실습;

import java.util.Scanner;

public class ForEyeEy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num * num; i++) {
            System.out.printf("%5d", i);
            count++;

            if(count % num == 0) {
                System.out.println();
            }
                  /*
                 /\_/\
                ( o.o )
                 > ^ <
                   */

                   /*
                 /\_/\
                ( -.- )
                 (~w~)
                   */
        }
    }
}
