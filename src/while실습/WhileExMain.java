package while실습;
// 두개의 주사위를 던져 같은 수가 나오면 값을 보여 주여주고 무인도 탈출
// 몇번만에 탈출에 성공했는지 보여 주기
// Math.random() : 0 ~ 1 미만의 무작위 실수값 생성



  /*      while (true) {
int a = (int) (Math.random() * 6) + 1;
int b = (int) (Math.random() * 6) + 1;
total++;

        if (a == b)
        {
        System.out.println(a + "," +  b + "로 같은 숫자 탈출! " + total + "번의 실행횟수!");
                break;
                        } */

public class WhileExMain {
    public static void main(String[] args) {
        int total = 0;
        while (true){
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            total++;

            if(a == b) {
                System.out.println("이걸 탈출하네;");
                break;
            }

            if(total == 100000000) {
                System.out.println("ㅋㅋ");
                System.out.println(a);
                System.out.println(b);
                break;
            }

        }

        System.out.println(total);
    }
}

