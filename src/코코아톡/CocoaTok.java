package 코코아톡;

public class CocoaTok {
    private String to;              // 상대방
    private String msg;             // 전송할 메세지
    private NetAdapter adapter;     // 연결할 네트워크를 추상화

    public CocoaTok(String to, NetAdapter adapter) {
        this.to = to;
        this.adapter = adapter;
    }

    public void writeMsg(String msg) {
        this.msg = msg;
    }
    public void send() {
        adapter.connect();
        adapter.send("보낸사람 = " + to + msg);
    }
}