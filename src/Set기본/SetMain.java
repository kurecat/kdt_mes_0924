package Set기본;
// set (집합) : 중복 허용하지 않음.
// 중복을 제거 하는 방법은 내부적으로 HashCode()와 equals() 사용하여 중복 여부를 판단

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Flow;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Java");

        System.out.println(set);

        // 합집합
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s1.addAll(s2); // 합집합, 중복 제거
        System.out.println(s1);

        // 교집합
        s1.retainAll(s2);
        System.out.println(s1); // 4, 5, 6 (s1, s2에 있는 값만)

        // 차집합
        s1.removeAll(s2);
        System.out.println(s1); // 1, 2, 3 (s1 에서 s2를 빼서 남은 값)

    }
}
