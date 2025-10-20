package 자바평가;

import java.util.List;
import java.util.Scanner;

public class Input {
    private final Scanner sc;

    public Input(Scanner sc) {
        this.sc = sc;
    }

    public int getMenu() {
        int menuChoice;
        while (true) {
            System.out.println("메뉴를 선택해 주세요 [1]커피 [2]음료 [3]디저트 [4]종료");
            System.out.print("선택 : ");
            menuChoice = sc.nextInt();
            sc.nextLine();
            if (menuChoice >= 1 && menuChoice <= 4) return menuChoice;
            System.out.println("메뉴 선택이 잘 못 되었습니다.");
        }
    }

    public MenuInfo1 getSubMenu(List<MenuInfo1> menu, String categoryName) {
        int choice;
        while (true) {
            System.out.println(categoryName + " 상세 종류를 선택해 주세요");
            for (int i = 0; i < menu.size(); i++) {
                System.out.print("[" + (i + 1) + "]" + menu.get(i).getName() + ", " + menu.get(i).getPrice() + "원 ");
            }
            System.out.println("\n[6]뒤로가기 [7]종료");
            System.out.print("\n선택 : ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 7) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            if (choice == 6) {
                return null;
            }

            if (choice >= 1 && choice <= menu.size()) {
                return menu.get(choice - 1);
            }
            System.out.println("종류 선택이 잘 못 되었습니다.");
        }
    }

    public boolean getTemperature() {
        int option;
        while (true) {
            System.out.println("온도를 선택해 주세요 [1]HOT [2]ICE");
            System.out.print("선택 : ");
            option = sc.nextInt();
            sc.nextLine();
            if (option == 1 || option == 2) return option == 1;
            System.out.println("온도 선택이 잘 못 되었습니다.");
        }
    }
}