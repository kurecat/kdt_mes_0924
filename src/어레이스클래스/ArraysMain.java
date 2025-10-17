package 어레이스클래스;
// 배열을 다루기위한 다양한 메서드 포함되어 있음
// T[] < Type 변수
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysMain {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
//        Arrays.sort(arr); // 기본적으로 오름차순 정렬
//        System.out.println(Arrays.toString(arr)); // Arrays에는 toString() 메서드가 오버라이딩 되어 있음
//
//        // 내림차순 정렬을 하기 위해서 reverseOrder() 메서드 사용, 내부고조가 제네릭으로 구현되어 있어서
//        // int -> Integer Wrapper 타입으로 바꿈.
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon", "Mango", "Watermelon", "Cherry", "Plum", "Peach"};

        // 정렬 조건을 만들기 위한 익명의 객체 생성
        // 먼저 길이순으로 정렬을 하고 길이가 같은 경우 사전 수 정렬
        // 반환값으로 정렬 여부를 결정 함.
        // 0 : 두 객체가 같음을 의미, 양수이면
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길기 때문에 정렬 시킴
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 사전순 정렬, 양수가 반환되며 첫번째 객체가 두번째 객체보다 크다.
                    }
                    return -1; // 현 상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit));
    }
}


