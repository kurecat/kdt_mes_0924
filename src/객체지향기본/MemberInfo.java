package 객체지향기본;
// email
// pwd
// 이름
// 주소
// 전화번호


public class MemberInfo {
    private String power;
    private String channel;
    private String volume;

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return power + ", " + channel + ", " + volume + ", ";
    }

}
