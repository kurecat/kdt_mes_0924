package 접근제한자;

public class Parent {
    public String name; // 접근 제한자가 없으면 default
    public String money;
    public String addr;
    public Parent(){
        name = "부자아빠";
        money = "350억";
        addr = "서울시 강남구 역삼동";
    }

}
