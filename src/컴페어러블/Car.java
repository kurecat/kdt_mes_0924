package 컴페어러블;

public class Car implements Comparable<Car>{ // <>  <- 제네릭타입.
    private String name; // 자동차 이름
    private int year; // 년식
    private String color; // 색상
    private int price; // 가격

    public Car(String name, int year, String color, int price) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) { // 정렬 기준을 만들어 줘야 함. 중복 기준이랑 같음.
        // 가격 기준 내림 차순으로 정렬하고, 가격이 같은 최신 연식으로 정렬하고 연식도 같으면 색상을 사전으로 정렬
        if (this.price != o.price) return o.price - this.price;
        if (this.year != o.year) return o.year - this.year;
        return this.color.compareTo(o.color); // 오름 차순
    }

    @Override
    public String toString(){
        return
                "-".repeat(10) + "\n" +
                "이름 : " + name + "\n" +
                "년식 : " + year + "\n" +
                "색상 : " + color + "\n" +
                "가격 : " + price;

     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
