package Super실습문제;
// 인스턴스 필드 : isTurbo (boolean)
// 생성자 :
// SportCar() : 부모의 기본 생성자 호출, turbo = false
// SportCar(String name) : super(280, "Red") 호출, turbo = ture, 이름지정
// displayInfo() 오버라이드 : turbo 여부까지 출력

public class SportCar extends Car {
    boolean isTurbo;

    public SportCar(){
        // 부모의 생성자 호출을 생략하면 기본 생성자가 호출 됨 : super() 이 생략된거임.
        this.isTurbo = false;
    }

    public SportCar(String name) {
        super(280, "Red");
        this.name = name;
        this.isTurbo = true;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- SportCar Info ---");
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " km/h");
        // isTurbo 필드 정보 추가 출력
        System.out.println("Turbo Mode: " + (this.isTurbo ? "ON" : "OFF"));
        System.out.println();
    }
}
