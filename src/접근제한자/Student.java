package 접근제한자;

public class Student extends Person{
    private String school;
    public Student(String name, int age, String addr, String ssn, String school) {
        super(name, age, addr, ssn);
        this.school = school;
    }
    public String getSchool(){
        return school;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
        System.out.println("주민번호 : " + getSsn());
        System.out.println("학교 : " + school);
    }
}

