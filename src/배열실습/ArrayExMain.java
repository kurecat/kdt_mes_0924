package 배열실습;
//

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5]; // 5명의 성적을 입력 받기 위한 배열
        int total = 0;

        for(int i = 0; i < scores.length; i++) {

            while(true) {
                System.out.print("기말고사 점수를 입력해 주세요 : ");
                scores[i] = sc.nextInt();

                if(scores[i] >= 0 && scores[i] <= 100) {
                    if(scores[i] < 40) {
                        scores[i] = 40;
                }
                    break;
                }
                System.out.println("잘못된 점수입니다. 0 ~ 100 사이의 점수를 다시 입력해 주세요.");
            }
        }
        for(int e : scores) {
            total += e;
        }
        System.out.printf("총점은 : %d, 평균은 : %.2f\n", total, (double)(total / scores.length) );
    }
}