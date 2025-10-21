package 집주소;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 스캐너
        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3}; // 각 숫자의 크기를 배열에 저정함.(1은2, 0은4, 나머지3)
        List<Integer> list = new ArrayList<>(); // 결과를 담을 리스트 생성
        while (true){ // 탈출 조건인 "0"을 입력 받기 전까지 무한반복
            System.out.println("숫자를 입력 해 주세요(1 ~ 9999)");
            System.out.print("입력 : ");
            String number = sc.nextLine(); // 문자 열로 입력받음.
            int sum = 0; // 입력 된 숫자 여백을 누적하기 위한 변수
            // 120을 입력 받았을 경우
            if (number.equals("0"))break; // 탈출 조건
            for (int i = 0; i < number.length(); i++){ // 120을 각각 '1', '2', '0' 순서대로 처리
                sum += numSize[number.charAt(i) - '0'] + 1;
                // number.charAt(i) - '0'
                // number는 입력한 120과 같은 문자열
                // .charAt(i)는 이 문자열에서 i번째 위치에 있는 문자 하나를 가져옴
                // 예를 들어 i 가 0이면, '1' 이라는 문자를 가져옴.
                // - '0'(가장 중요함)
                // 0은 아스키코드로 48임.
                // 그래서 ['1'] - ['0'] == [49] - [48] => 정수 1 이 나옴.
            }
            list.add(sum + 1); // + 1 = 맨앞의 공백 계산.
        }
        for (int e :list) System.out.println(e);
    }
}