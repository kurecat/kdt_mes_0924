package 리스트객체;
// 이름, String
// 가격, int
// 카테고리, String
// 설명, String
// 세금 포함 여부, boolean

// 매개변수가 전부 있는 생성자
// toString 오버라이딩해서 정보 출력하기

public class MenuInfo {
    private String name;
    private int price;
    private String category;
    private String explanation;
    private boolean duty;

    public MenuInfo(String name, int price, String category, String explanation, boolean duty) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.explanation = explanation;
        this.duty = duty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public boolean isDuty() {
        return duty;
    }

    public void setDuty(boolean duty) {
        this.duty = duty;
    }

    @Override
    public String toString(){
        return "["+"메뉴 : " + name + " 가격 : "+ price + "원" +" 카테고리 : " + category + " 설명 : " + explanation + " 세금 여부 : " + duty + "]";
    }
}
