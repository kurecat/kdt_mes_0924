package 열거클래스;
// 열거 타입 : 한정된 상수 집합을 정의 할 수 있는 참조 타입
// - 비교 시 값 뿐만 아니라 타입도 검사
// - 기존의 public static final 상수를 대체 하기도 함.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        List<Developer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Developer developer = new Developer();

        for (int i = 0; i < 5; i++) {
            System.out.println("[" + (i + 1) + "번째 개발자 입력]");
            // 이름 입력 받기.
            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();
            developer.setName(name);

            // 업무 입력 받기
            System.out.print("개발업무를 선택하세요 [1]FRONTEND [2]BACKEND [3]FULLSTACK [4]MOBILE [5]AI : ");
            int ty = sc.nextInt();
            DevType type = null;
            switch (ty) {
                case 1: type = DevType.FRONTEND;break;
                case 2: type = DevType.BACKEND;break;
                case 3: type = DevType.FULLSTACK;break;
                case 4: type = DevType.MOBILE;break;
                case 5: type = DevType.AI;break;
                default: System.out.println("개발업무를 다시 선택해주세요");
                    // 경력 입력 받기
                    System.out.print("경력을 선택하세요 [1]JUNIOR [2]SENIOR : ");
                    int ca = sc.nextInt();
                    Career career = null;
                    switch (ca) {
                        case 1: career = Career.JUNIOR;break;
                        case 2: career = Career.SENIOR;break;
                        default: System.out.println("경력을 다시 선택해 주세요");
                    }
                    // 성별 입력 받기
                    System.out.print("성별을 선택하세요 [1]MALE [2]FEMALE : ");
                    int ge = sc.nextInt();
                    Gender gender = null;
                    switch (ge) {
                        case 1: gender = Gender.MALE;break;
                        case 2: gender = Gender.FEMALE;break;
                    }

                    list.add(new Developer(name, type, career, gender));
                    sc.nextLine();
            }
            System.out.println("=".repeat(10) + "개발자 목록" + "=".repeat(10));
            for (Developer dev : list) {
                System.out.println(dev);
                System.out.println("-".repeat(30));
            }
        }
    }
}