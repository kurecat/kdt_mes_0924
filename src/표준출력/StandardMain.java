package 표준출력;
// 자바의 표준 입출력 클래스 : System
// System.in :  표준 입력 스트림
// System.out : 표준 출력 스트림
// System.out.println(내용)
// System.out.print(내용)
// System.out.printf("서식", 내용)
// System.err : 표준 오류 스트림

// 이스케이프 시퀸스 :\n, \r, \t, \b, \\

// 이름, 전화번호, 주소, 국어, 영어, 수학 성적을 정하고, 평균과 총점을 구해서 출력하기


public class StandardMain {
    public static void main(String[] args) {
        String name = "정동균";
        String tel = "010-9940-6408";
        String adder = "충청남도 천안";
        char gender = 'M';
        int kor = 88;
        int eng = 88;
        int mat = 88;
        int total = kor + eng + mat;

        double avg = (total / 3.0);
        System.out.println("이름은 : " + name + "\n" + "성별은 : " + ((gender == 'M') ? "남성": "여성") + "\n" + "전화번호는 : " + tel + "\n" + "주소는 : " + adder + "\n" + "총점은 : " + total + "\n" + "평균은 : " + avg);

        // 서식지정자 스타일 : %
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", adder);
        System.out.printf("총점 : %d\n", total);
        System.out.printf("평균 : %.2f\n", avg); // .2f 소수점 3자리수를 올림해서 2자리수로 표기.
    }
}
