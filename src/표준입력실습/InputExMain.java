package 표준입력실습;
// 이름(next), 전화번호(next), 주소(nextLine), 성별(char), 나이(int), 직업(문자열)을 입력받아 이쁘게 출력하기
// 스캐너 연속 입력 시 버퍼 비우기 필요 할 수 있음 : sc.nextLine()
import java.util.Scanner;

public class InputExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        sc.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        String tel = sc.next();

        sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String adder = sc.nextLine();

        System.out.print("성별을 입력하세요('M' , 'G') : ");
        char gender = sc.next().charAt(0);

        sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("직업를 입력하세요 : ");
        String job = sc.nextLine();

        System.out.println("-----------");
        System.out.println("이름은 " + name + "입니다");
        System.out.println("전화번호는 " + tel + "입니다");
        System.out.println("주소는 " + adder + "입니다");
        System.out.println("성별은 " + ((gender == 'M') ? "남성": "여성") + "입니다");
        System.out.println("나이는 " + age + "입니다");
        System.out.println("직업은 " + job + "입니다");
        System.out.println("-----------");

    }
}
