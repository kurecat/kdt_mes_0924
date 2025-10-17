package 인터페이스리모콘;

public class Audio implements RemoteControl {
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
        System.out.println("현재 볼륨 : " + volume);
    }
    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("오디오를 무음 처리 합니다.");
        else System.out.println("오디오 무음을 해제합니다.");
    }

}
