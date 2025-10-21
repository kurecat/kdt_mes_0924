package 해시맵;
// 메뉴이름, 가격, 분류, 설명

public class MenuMap {
    private String name;
    private int price;
    private String classification;
    private String desc;

    public MenuMap(String name, int price, String classification, String desc) {
        this.name = name;
        this.price = price;
        this.classification = classification;
        this.desc = desc;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return
               "메뉴 이름 : " + name + "\n" +
                "가격 : " + price + "\n" +
                 "종류 : " + classification + "\n" +
                  "설명 : " + desc;
    }
}
