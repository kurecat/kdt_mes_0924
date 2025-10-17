package 코코아톡;

public interface NetAdapter {
    void connect();
    void send(String msg);

}

class wiFi implements NetAdapter {
    @Override
    public void connect() {
        System.out.println("WIFI에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WIFI : " + msg);
    }
}

class FiveG implements NetAdapter{

    @Override
    public void connect() {
        System.out.println("5G에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G : " + msg);
    }
}

class Lte implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("LTE에 연결 되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("LTE : " + msg);
    }
}