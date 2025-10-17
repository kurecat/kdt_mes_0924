package 상속TV;

public class inheritanceTvMain {
    public static void main(String[] args) {
    ProductTv tv1 = new ProductTv(false, 11, 20, false);
    tv1.setPower(true);
    tv1.setChannel(false,1200);
    tv1.setVolume(120);
    System.out.println(tv1);

    }
}
