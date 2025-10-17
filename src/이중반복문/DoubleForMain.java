package 이중반복문;

//        System.out.print("정수값을 입력 : ");
//        int num = sc.nextInt();
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("[ i = " + i + " ] ");
//            for(int j = 0; j < num; j++) {
//                System.out.print(" * ");
//            }
//
//            System.out.println();
//        }
// 2중 for 문을 이용해서 구구단 2단 ~ 9단 까지 찍기
//        for(int i = 2; i < 10 ; i++) {
//            for(int j = 1; j < 10; j++){
//                System.out.println(i + " x " + j + " = " + i*j);
//            }
//            System.out.println();
//        }
// 별 찍기 : 5
// *
// * *
// * * *
// * * * *
// * * * * *
import java.util.Scanner;

public class DoubleForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
