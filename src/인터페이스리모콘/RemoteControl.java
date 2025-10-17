package 인터페이스리모콘;
// interface 키워드로 선언.
// public static final : 아무곳에서나 참조하고, 한번만 선언되고, 상수로 선언(값의 변경 X).

public interface RemoteControl {
    int MAX_VOLUME = 100; // public static final이 자동으로 추가되어 상수로 만들어짐,
                          // 설계명세에서 범위값 정보를 클래스에 전달하는 용도
    int MIX_VOLUME = 0;

    void turnOn(); // public abstract가 자동 추가, 왜냐하면 기본적으로 인터페이스는 완전 추상화이기 때문,
                   // 상속 받은 클래스에서 반드시 오버라이딩 해야함.
    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해체 합니다.");
    }

    static void changBattery() { // 이런 경우 {} < 자기 구현부가 있어야함.
        System.out.println("건전지를 교환합니다.");
    }
}