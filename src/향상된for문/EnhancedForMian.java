package 향상된for문;
// 배열 또는 이터러블(List, Set)을 간단하게 순회 할 때 사용
// 인덱스 관리가 필요 없고, 읽기 위주의 작업을 수행 할 때 사용

public class EnhancedForMian {
    public static void main(String[] args) {
        int[] scores = {99, 67, 89, 100, 60};
        int total = 0;
        // 기존의 for문을 사용하는 방법 (총점과 평균 구하기)
        // 배열의 인덱스 기반 순회 (초기값, 최종값은 배열의 길이 미만, 증감값)

        for(int i = 0;i < scores.length; i++) {
            total += scores[i]; // 배열의 값을 누적함
        }
        System.out.printf("총점은 : %d, 평균은 : %.2f\n", total, (double)(total / scores.length) );

        // 향상된 for문을 사용하는 방법
        // 배열의 값 요소의 값을 자동 순회, 배열의 값을 변경 불가, 무조건 배열 전체 순회

        for(int e : scores){
            total += e;
        }
        System.out.printf("총점은 : %d, 평균은 : %.2f\n", total, (double)(total / scores.length) );
    }
}
