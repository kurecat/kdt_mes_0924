package 조건문;
// 제어문 : 프로그램이 원하는 결과를 얻기 위해 프로그램의 흐름의 제어 하는 것
// 조건문 : 주어진 조건식에 따라 조건을 분기 하는 것
// 반복문 : 주어진 조건이 참인동안 반복
// 국어, 영어, 수학 성적을 입력 받음
// 이름을 입력 받음
// 국어, 영어, 수학 성적이, 0 미만이거나 100 초과이면 입력 오류라고 출력하고
// 정상적인 입력이면 총점과 평균을 구하고
// 평균이 90점 이상이면 이름과 총점, 평균, 등급 : A
// 평균이 80점 이상이면 이름과 총점, 평균, 등급 : B
// 평균이 70점 이상이면 이름과 총점, 평균, 등급 : C
// 평균이 60점 이상이면 이름과 총점, 평균, 등급 : D
// 나머지는 이름과 총점, 평균, 등급 : F

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = 0;
        int eng = 0;
        int mat = 0;

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        while (true) {
            System.out.print("국어 성적을 입력하세요 : ");
            kor = sc.nextInt();
            if (kor >= 0 && kor < 101) break; // break 가 걸려 있어 else 를 따로 안넣어도 됨.
            System.out.println("성적을 잘못 입력했습니다.");
        }

        while (true) {
            System.out.print("영어 성적을 입력하세요 : ");
            eng = sc.nextInt();
            if (eng >= 0 && eng < 101) break; // break 가 걸려 있어 else 를 따로 안넣어도 됨.
            System.out.println("성적을 잘못 입력했습니다.");
        }

        while (true) {
            System.out.print("수학 성적을 입력하세요 : ");
            mat = sc.nextInt();
            if (mat >= 0 && mat < 101) break; // break 가 걸려 있어 else 를 따로 안넣어도 됨.
            System.out.println("성적을 잘못 입력했습니다.");
        }

        int total = kor + eng + mat;
        int avg = total / 3;

        if (avg >= 90) {
            System.out.println("=================");
            System.out.println("이름 : " + name);
            System.out.println("총합 : " + total);
            System.out.println("평균 : " + avg);
            System.out.println("등급 : A");
            System.out.println("=================");
        } else if (avg >= 80) {
            System.out.println("=================");
            System.out.println("이름 : " + name);
            System.out.println("총합 : " + total);
            System.out.println("평균 : " + avg);
            System.out.println("등급 : B");
            System.out.println("=================");
        } else if (avg >= 70) {
            System.out.println("=================");
            System.out.println("이름 : " + name);
            System.out.println("총합 : " + total);
            System.out.println("평균 : " + avg);
            System.out.println("등급 : C");
            System.out.println("=================");
        } else if (avg >= 60) {
            System.out.println("=================");
            System.out.println("이름 : " + name);
            System.out.println("총합 : " + total);
            System.out.println("평균 : " + avg);
            System.out.println("등급 : D");
            System.out.println("=================");
        } else {
            System.out.println("=================");
            System.out.println("이름 : " + name);
            System.out.println("총합 : " + total);
            System.out.println("평균 : " + avg);
            System.out.println("등급 : F");
            System.out.println("=================");
        }
    }
}
