package 로또번호중복제거;
// 1 ~ 45 사이의 임의의 수 6개 생성 (중복 되면 안됨)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoMain {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        // 1. List를 사용해 중복 제거 해보기
        while (list.size() < 6){
            int number = (int)(Math.random() * 45) + 1;

            if (!list.contains(number)) {
                list.add(number);
            }
        }
        // 2. Set을 사용해 중복 제거 해보기

        Set<Integer> lottoSet = new HashSet<>();
        while (lottoSet.size() < 6) {
            lottoSet.add((int)(Math.random() * 45) + 1);
        }
        System.out.println(list);
        System.out.println(lottoSet);
    }
}