package 다운캐스팅피하기;

public abstract class Animal {
    public void move() {
        System.out.println("동물이 움직 입니다.");
    }
    // 부모가 추상 메서드를 만들었기 떄문에 상속 받는 클래스에서 반드시 오버라이드 해여함.
    public abstract void specialAbility();
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람은 두 발로 걷습니다.");
    }

    public void specialAbility() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void specialAbility() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void specialAbility() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}