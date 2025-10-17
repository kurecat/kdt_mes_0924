package 샘플;

public class SampleMain {
    // main 메소드는 꼭 필요 (JVM)
    // 클래스 안에 main 메소드가 들어가야함. -> main 메소드 혼자 실행 불가
    public static void main(String[] args) {
        System.out.println("안녕하세요. 자바를 배워 보겠습니다");
        char gender = '남';
        // char에 글자를 넣어도 정수가 움직임 ex) '남' = 45224
        // 그래서 int = 4byte
        // char = 2byte
        System.out.println((int)gender);

        // 변수 : 값을 저장하기 위해 메모리 공간을 확보하고 이름을 붙인 것
        // 변수를 선언만 하는 방법
        int age;
        int score = 99; // 변수의 선언과 동시에 값을 대입
        int total = 0;; // 변수를 선언하고 초기화

        boolean isTrue; // 논리형 변수 선언 : 참과 거짓으로만 구분

        // 정수형 번수 선언
        byte bNum; // 1byte 크기의 변수 선언 -128 ~ +127
        short sNum; // 2byte 크기의 변수 선언 -32768 ~ +32767
        int iNum; // 4byte 크기의 변수 선언 -2,147,483,648 ~ +2,147,483,647 (약 -21 ~ +21억)
        long lNum; // 8byte
        // 실수형 변수 선언, 근사치 계산법으로 계산하기 때문에 정확한 값이 표현 되지 않을 수 있음
        float fNum; // 4byte (지수부, 허수부 포함)
        double dNum; // 8byte

        // 문자형, 2byte 이며, 음수가 존재하기 않음, 내부적으로는 정수값이 사용됨
        char ch = 'M'; // 문자형은 '' 작은 따옴표로 표시되고 내부적으로는 정수값으로 사용됨

        // 문자열 (str 은 8byte)
        String str; // 참조 타입이기 때문에 앞이 대문자. str에는 문자가 들어가는게 아니라 문자가 있는 주소가 들어옴.

        double num1 = 0.1;
        for(int i = 0; i < 999; i++){
            num1 += 0.1;
        }
        System.out.println(num1);
    }
}
// 사용자 정의 자료형
class NameCard{ // 클래스 이름은 대문자 여야함.
    String name;
    int age;
    String addr;
}