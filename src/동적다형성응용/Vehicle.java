package 동적다형성응용;

import java.lang.invoke.VolatileCallSite;

public class Vehicle {
    public void run () {
        System.out.println("차량이 달립니다.");
    }
}

class SportCar extends Vehicle {
    @Override
    public void run() {
        System.out.print("스포츠카가 달립니다.");
    }
}

class Sedan extends Vehicle {
    @Override
    public void run() {
        System.out.print("승용차가 달립니다.");
    }
}

class Suv extends Vehicle {
    @Override
    public void run() {
        System.out.println("SUV가 달립니다.");
    }
}