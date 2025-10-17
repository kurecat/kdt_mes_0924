package 열거클래스;

enum DevType {
    FRONTEND, BACKEND, FULLSTACK, MOBILE, AI
}
enum Career {
    JUNIOR, SENIOR
}

enum Gender {
    MALE, FEMALE
}

public class Developer {
    private String name;
    private DevType type;
    private Career career;
    private Gender gender;

    // 매개변수가 전부 있는 생성자 만들기.
    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }

    // 매개변수가 없는 생성자 만들기.
    public Developer() {
    }

    // 각각의 정보를 설정하는 세터 메서드 만들기

    public void setName(String name) {
        this.name = name;
    }

    // toString() 오버라이딩 해서 이름, 업무, 경력, 성별 출력하기.

    @Override
    public String toString() {
        return "이름 :" + name + " 업무 :" + this.type + " 경력 :" + this.career + " 성별 :" + this.gender;
    }
}
