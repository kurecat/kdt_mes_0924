package 오브젝트클래스;
// Object 클래스 : 모든 클래스의 최상위 부모 클래스
// 해시코드 형식으로 나오는 이유? = 보안을 위해서? 객체가 같은지 다른지 판별하기 위해서?
//

public class ObjectMain {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        System.out.println(st1.toString()); // 객체 정보를 문자열로 반환, 패키지명.클래스명@16진수_해시코드 형식
        System.out.println(st1);

        // equals() : 두 객체의 주소를 비교, 하지만 String 등의 클래스에서는 오버라이드가 이미 되어 있음.
        System.out.println(st1.equals(st2));

        // clone() : 얕은 복사를 깊은 복사로 바꿔줌.
        Student st3 = st1;
        st1.name = "곰돌이";
        st1.id = 1004;

        System.out.println("이름 : " + st3.name);
        System.out.println("아이디 : " + st3.id);

    }
}

class Student { // extends Object << 기본적으로 상속되어 있으며, 숨겨져 있음.
    int id = 100;
    String name = "장원영";

    @Override
    public String toString() {
        return "id : " + id + ", name : " + name;
    }
}