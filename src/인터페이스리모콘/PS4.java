package 인터페이스리모콘;

public class PS4 implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오의 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIX_VOLUME) {
            this.volume = RemoteControl.MIX_VOLUME;
        } else {
            this.volume = volume;
        }
    }

}