package 슈퍼매서드;
// super : 부모의 필드값을 조회할때 사용
// super() : 부모의 생성자를 호출 할 때 사용, this() 메서드는 자신의 다른 생성자 호출 시 사용

public class SuperMain {
    public static void main(String[] args) {
    Child child = new Child();
    child.display();
    }
}

class Parent {
    int x = 10;

//    public Parent(int x) {
//        this.x = x;
//    } // 부모 생성자를 불러주면, 상속된 자식 클래스에도 해줘야함.
}

class Child extends Parent {
    int x = 20;
    int y = 40;

//    public Child(int x, int y) {
//        super(x); // 부모의 생성자를 호출, 부모생성자가 없으면 얘도 생략.
//        this.y = y;
//    }


    void display() {
        System.out.println("x = " + x); // 20
        System.out.println("this.x = " + this.x); // 20
        System.out.println("super.x = " + super.x); // 10
        System.out.println("super.x = " + super.x + this.x); // 1020
    }
}