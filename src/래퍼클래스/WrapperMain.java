package 래퍼클래스;
// Wrapper 클래스 타입(참조타입) (Byte, Short, Integer = 8byte)
// 기본 타입의 데이터를 객체로 취급해야 하는 경우(제네릭, 컬렉션 프레임워크) 사용
// 데이터의 크기에 상관없이 주소를 보고 동일한 방법으로 관리할려고 씀.

public class WrapperMain {
    public static void main(String[] args) {
        int kor = 89;  // 기본 타입에 값을 대입하기 때문에 아무 일도 안 일어남.
        Integer eng = 90;  // Wrapper 클래스 타입에 값을 대입 했기 떄문에 내부적으로 Boxing 동작이 일어남.
        int total = kor + eng; // 내부적으로 Unboxing 동작이 일어남

        System.out.println(total);
    }
}
