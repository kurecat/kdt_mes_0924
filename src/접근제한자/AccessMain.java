package 접근제한자;

public class AccessMain {
    public static void main(String[] args) {
        Person p1 = new Person("장원영", 22,"서울시","030101-411111");
        Student s1 = new Student("안유진", 23, "대전시","020101-1458142", "천안고");
        s1.showInfo();


        System.out.println("이름 : " + s1.name); // public
        System.out.println("나이 : " + s1.age);  // protected
        System.out.println("주소 : " + s1.addr); // default
        System.out.println("주민번호 : " + s1.getSsn());
        System.out.println("학교 : " + s1.getSchool());
    }
}
