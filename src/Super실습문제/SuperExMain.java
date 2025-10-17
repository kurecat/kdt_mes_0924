package Super실습문제;

public class SuperExMain {
    public static void main(String[] args) {
        Car basicCar = new Car();
        basicCar.displayInfo();

        Car customCar = new Car(150, "Blue");
        customCar.displayInfo();

        SportCar defaultCar = new SportCar();
        defaultCar.displayInfo();

        SportCar ferrari = new SportCar("Ferrari");
        ferrari.displayInfo();

        Car customCar2 = new Car(150,"Black","K5");
        customCar2.displayInfo();

        SportCar rombo = new SportCar("rombo");
        rombo.displayInfo();

    }
}
