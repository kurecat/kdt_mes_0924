package 매쓰클래스;
// Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스.
// 한번 만들어진 함수들을 호출해서 사용하는 용도

public class MathMain {
    public static void main(String[] args) {
        // random() 메서드 : 0.0 ~ 1.0 미만의 범위의 임의의 값 생성

        int r = (int) (Math.random() * 100) + 1;
        System.out.println(r);
    }
}
