package 비트연산;

public class BitMain {
    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 12;
        System.out.println(num1 & num2); // & (bit and) : bit 가 모두 1인 경우 1
        System.out.println(num1 | num2); // | (bit or) : bit 가 1개만 1이어도 1
        System.out.println(num1 ^ num2); // ^ (xor) : 두개의 bit 값이 서로 다른 경우 1
        System.out.println(~num1); // ~ (bit not) : 비트의 값을 반전
        System.out.println(num1 << 1); // bit 를 왼쪽으로 1만큼 이동
        System.out.println(num1 >> 1); // bit 를 오른쪽으로 이동
    }
}
