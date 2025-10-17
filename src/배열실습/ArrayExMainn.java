package 배열실습;

import java.util.Arrays;

public class ArrayExMainn {
    public static void main(String[] args) {
        // 1. 로또 번호 7개를 저장할 배열 생성 (6 -> 7로 변경)
        int[] lottoNumbers = new int[7];
        int count = 0;
        // 2. 배열에 숫자 7개가 모두 채워질 때까지 반복 (6 -> 7로 변경)
        while (count < 7) {
            int randomNumber = (int) (Math.random() * 45) + 1;

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (lottoNumbers[i] == randomNumber) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                lottoNumbers[count] = randomNumber;
                count++;
            }
        }
        // 3. 보기 좋게 정렬
        Arrays.sort(lottoNumbers);
        // 4. 최종 생성된 로또 번호 배열 출력
        System.out.println("생성된 7자리 로또 번호: " + Arrays.toString(lottoNumbers));
    }
}