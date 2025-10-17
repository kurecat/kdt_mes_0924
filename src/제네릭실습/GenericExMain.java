package 제네릭실습;

public class GenericExMain {
    public static void main(String[] args) {
        // <Powder> 타입을 제한 함, 타입 변수 자리이기 떄문에 참조 타입 아무거나 올 수 있지만, 지정된 타입만 받겠다는 의미
        GanericPrinter<Powder> powderPrinter = new GanericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);
        powderPrinter.getMaterial().doPrinting();

        GanericPrinter<Plastic> plasticPrinter = new GanericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
        plasticPrinter.getMaterial().doPrinting();

        // Nylon 재료를 주입해서 출력
        GanericPrinter<Nylon> nylonPrinter = new GanericPrinter<>();
        nylonPrinter.setMaterial(new Nylon());
        System.out.print(nylonPrinter);
        nylonPrinter.getMaterial().doPrinting();

        GanericPrinter<Water> waterPrinter = new GanericPrinter<>();
    }
}
