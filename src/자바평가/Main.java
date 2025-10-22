package 자바평가;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { // 메인
    public static void main(String[] args) {
        List<MenuInfo1> coffeeMenu = new ArrayList<>();
        List<MenuInfo1> drinkMenu = new ArrayList<>();
        List<MenuInfo1> dessertMenu = new ArrayList<>();
        List<MenuInfo1> orderCart = new ArrayList<>();


        // 커피 메뉴
        coffeeMenu.add(new MenuInfo1("에스프레소", 1000));
        coffeeMenu.add(new MenuInfo1("아메리카노", 2000));
        coffeeMenu.add(new MenuInfo1("아이스티샷추가", 3000));
        coffeeMenu.add(new MenuInfo1("카페라떼", 2500));
        coffeeMenu.add(new MenuInfo1("헤이즐넛", 3000));

        // 음료 메뉴
        drinkMenu.add(new MenuInfo1("미숫가루", 3000));
        drinkMenu.add(new MenuInfo1("청포도에이드", 4500));
        drinkMenu.add(new MenuInfo1("딸기라떼", 4000));
        drinkMenu.add(new MenuInfo1("프로틴쉐이크 바나나", 5000));
        drinkMenu.add(new MenuInfo1("매실티", 3500));

        // 디저트 메뉴
        dessertMenu.add(new MenuInfo1("소프트 아이스크림", 1800));
        dessertMenu.add(new MenuInfo1("크리미슈", 1500));
        dessertMenu.add(new MenuInfo1("사라다빵", 2500));
        dessertMenu.add(new MenuInfo1("소금빵", 2000));
        dessertMenu.add(new MenuInfo1("고구마빵", 2500));
        int totalPrice = 0;
        Scanner sc = new Scanner(System.in);
        Input in = new Input(sc);


        while (true) {
            int mainMenuChoice = in.getMenu();

            if (mainMenuChoice == 4) {
                System.out.println("=".repeat(5) + "최종 주문 내역" + "=".repeat(5));
                for (MenuInfo1 item : orderCart) {
                    System.out.println(item.getName() + " : " + item.getPrice() + "원");
                    totalPrice += item.getPrice();
                }
                System.out.println("=".repeat(20));
                System.out.println("총 결제 금액: " + totalPrice + "원");
                System.out.println("=".repeat(20));
                System.out.println("종료합니다.");
                break;
            }

            MenuInfo1 selectedItem = null;

            switch (mainMenuChoice) {
                case 1:
                    selectedItem = in.getSubMenu(coffeeMenu, "커피");
                    break;
                case 2:
                    selectedItem = in.getSubMenu(drinkMenu, "음료");
                    break;
                case 3:
                    selectedItem = in.getSubMenu(dessertMenu, "디저트");
                    break;
                default:
                    System.out.println("메뉴를 다시 선택해 주세요");
                    continue;
            }

            if (selectedItem == null) {
                continue;
            }

            if (mainMenuChoice == 1 || mainMenuChoice == 2) {
                boolean isHot = in.getTemperature();
                String temp = isHot ? "HOT" : "ICE";

                System.out.println("=".repeat(5) +  "주문 확인" + "=".repeat(5));
                System.out.println("선택하신 메뉴: " + selectedItem.getName());
                System.out.println("가격: " + selectedItem.getPrice() + "원");
                System.out.println("온도: " + temp);
                System.out.println("=".repeat(20));

            } else {
                System.out.println("=".repeat(5) +  "주문 확인" + "=".repeat(5));
                System.out.println("선택하신 메뉴: " + selectedItem.getName());
                System.out.println("가격: " + selectedItem.getPrice() + "원");
                System.out.println("=".repeat(20));
            }

            orderCart.add(selectedItem);
        }
    }
}