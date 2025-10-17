package Super실습문제;
// 인스턴스 필드 : speed, color, name
// 생성자 오버로딩 :
// Car() : 기본 speed = 100, color = "White", name = "BasicCar"
// Car(int speed, String color) : speed와 color 지정, name = "CustomCar"
// displayInfo() 메서드 : 자동차 정보를 출력

public class Car {
    int speed;
    String color;
    String name;

    public Car() {
        speed = 100;
        color = "White";
        name = "BasicCar";
    }

    public Car(int speed, String color){
        this.speed = speed;
        this.color = color;
        this.name = "CustomCar";
    }

    public Car(int speed, String color, String name){
        this.speed = speed;
        this.color = color;
        this.name = name;
    }

    void displayInfo() {
        System.out.println("--- Car Info ---");
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println(); // 가독성을 위한 줄바꿈
    }

}
