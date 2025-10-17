package 추상클래스기본;

public class AndroidPhone extends Phone{
    public AndroidPhone(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println("추상 메서드를 상속 받아 Call 기능을 구현");
    }

    @Override
    public void store() {
        System.out.println("Google Store 기능을 추가합니다.");
    }
}