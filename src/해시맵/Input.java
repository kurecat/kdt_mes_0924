package 해시맵;

import java.util.HashMap;
import java.util.Scanner;

public class Input extends HashMapMain{
    private static final Scanner sc = new Scanner(System.in);
    private static final HashMap<String, MenuMap> map = new HashMap<>();

    static void initMenu() { // 초기 메뉴 3개.
        map.put("아메리카노", new MenuMap("아메리카노", 2000, "음료", "기본 커피"));
        map.put("카페라떼", new MenuMap("카페라떼", 2500, "음료", "기본 커피"));
        map.put("캬라멜마끼야또", new MenuMap("캬라멜마끼야또", 3000, "음료", "기본 커피"));
    }

    static void menuList() { // 전체 조회 - 완
        System.out.println("=".repeat(5) + "전체 메뉴 조회" + "=".repeat(5));
        for (String e : map.keySet()) {
            System.out.println(map.get(e));
            System.out.println("=".repeat(20));
        }
    }

    static void createMenu() { // 메뉴 등록 - 완
        System.out.println("메뉴를 입력 해 주세요");
        System.out.print("입력 : ");
        String key = sc.nextLine();

        if (!map.containsKey(key)){
            System.out.println("가격을 입력 해 주세요");
            System.out.print("입력 : ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.println("분류를 입력 해 주세요");
            System.out.print("입력 : ");
            String classification = sc.nextLine();

            System.out.println("설명을 입력 해 주세요");
            System.out.print("입력 : ");
            String desc = sc.nextLine();

            map.put(key, new MenuMap(key, price, classification, desc));
            System.out.println("새로운 메뉴가 등록 되었습니다.");
            menuList();
        } else {
            System.out.println("해당 메뉴가 존재 합니다.");
        }
    }

    static void deleteMenu() { // 메뉴 삭제 - 완
        menuList();
        System.out.println("삭제 할 메뉴를 입력 해 주세요");
        System.out.print("입력 : ");
        String key = sc.nextLine();

        if (map.containsKey(key)){
            map.remove(key); // 키를 입력 받아 entry(key, value)를 삭제함.
            System.out.println(key + " 메뉴를 삭제 했습니다.");
        } else {
            System.out.println("입력 하신 메뉴는 없는 메뉴 입니다.");
        }
    }

    static void updateMenu() { // 메뉴 수정
        System.out.println("수정 할 메뉴를 입력 해 주세요");
        System.out.print("입력 : ");
        String key = sc.nextLine();

        if (map.containsKey(key)){
            System.out.println("수정하실 가격을 입력 해 주세요");
            System.out.print("입력 : ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.println("수정하실 분류를 입력 해 주세요");
            System.out.print("입력 : ");
            String classification = sc.nextLine();

            System.out.println("수정하실 설명을 입력 해 주세요");
            System.out.print("입력 : ");
            String desc = sc.nextLine();

            map.replace(key , new MenuMap(key, price,classification,desc));
            menuList();
        } else {
            System.out.println("입력 하신 메뉴는 없는 메뉴 입니다.");
        }

    }

    static void searchMenu() { // 메뉴 검색 map.containsKey();
        System.out.println("검색 할 메뉴를 입력 해 주세요");
        System.out.print("입력 : ");
        String key = sc.nextLine();

        if (map.containsKey(key)) {
            System.out.println("=".repeat(20));
            System.out.println(map.get(key));
            System.out.println("=".repeat(20));
        } else {
            System.out.println("입력 하신 메뉴는 없는 메뉴 입니다.");
        }
    }
}
