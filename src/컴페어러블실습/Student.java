package 컴페어러블실습;

public class Student implements Comparable<Student>{
    String name; // 이름
    int studentNumber; // 학번
    int kor; // 국어
    int eng; // 영어
    int mat; // 수학
    int sci; // 과학
    int total;
    int age;

    public Student(String name, int studentNumber, int kor, int eng, int mat, int sci) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sci = sci;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getTotal() != o.getTotal()){
            return o.getTotal() - this.getTotal();
        }
        return this.studentNumber - o.studentNumber;
    }

    @Override
    public String toString(){
        return "학번 : " + studentNumber + " 이름 : " + name + " 총점 : " + getTotal() + " 평균 : " + getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getTotal() {
        return kor + eng + mat + sci;
    }


    public double getAge() {
        return getTotal() / 4.0;
    }


}
