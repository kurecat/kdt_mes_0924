package 접근제한자;

public class Person {
    public String name;
    protected int age;
    String addr;
    private String ssn;

    public Person(String name, int age, String addr, String ssn) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.ssn = ssn;
    }
    public String getSsn() {
        return ssn;
    }

}
