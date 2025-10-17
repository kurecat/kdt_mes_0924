package 배열실습;

import java.util.Arrays;

public class ArrayExxMain {
    public static void main(String[] args) {
        int[] lotto = new int[7];
        int rand; // 로또 번호 생성용 변수
        int index = 0; // 중복 제거를 위한 index 계산
        boolean isExist = false; // 중복 여부에 대한 flag
        while (true) { // 횟수를 알 수 없을 때 사용
            rand = (int) (Math.random() * 45) + 1;
            for (int i = 0; i < 7; i++) { // 배열을 순회하면서 중복값 여부를 체크
                if (lotto[i] == rand) isExist = true; // 배열내에 현재 생성한 번호가 포함되어 있으면 flag를 true로 변경함.
            }
            if (!isExist) lotto[index++] = rand; // 해당 인덱스에 생성된 로또 번호를 대입 후 증가
            if (index == 7) break;
            isExist = false; // 다시 flag를 초기화

        }
        Arrays.sort(lotto);
        System.out.println("생성된 7자리 로또 번호: " + Arrays.toString(lotto));
    }
}
