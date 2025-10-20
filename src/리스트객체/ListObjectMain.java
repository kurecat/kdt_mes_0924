package 리스트객체;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListObjectMain {
    public static void main(String[] args) {
        // ArrayList 생성
        List<MenuInfo> list = new ArrayList<>();
        // 메뉴 객체 5개 추가 하기 (기본메뉴)
        list.add(new MenuInfo("아메리카노", 2000, "커피", "아메리카노임.", true));
        list.add(new MenuInfo("라떼", 4000, "음료", "우유 커피", true));
        list.add(new MenuInfo("홍차", 4000, "차", "홍차 입니다.", false));
        list.add(new MenuInfo("바게트", 5000, "빵", "빵 입니다.", true));
        list.add(new MenuInfo("모카", 5000, "음료", "달달한 커피", true));
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴 선택 [1]전체 조회 [2]메뉴 등록 [3]메뉴 수정 [4]메뉴 삭제 [5]메뉴 검색 [6]종료");
            System.out.print("선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: // [1] 전체 조회 - 완
                    int idx = 0; // 인덱스 번호를 주기 위해서 변수 생성
                    for(MenuInfo e : list) {
                        System.out.println("[" + ++idx + "]" + e);
                    }
                    break;

                case 2:  // [2] 메뉴 등록 - 완
                    System.out.print("메뉴 이름 : ");
                    String name = sc.nextLine();

                    System.out.print("가격 : ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    System.out.print("카테고리 : ");
                    String category = sc.nextLine();

                    System.out.print("설명 : ");
                    String explanation = sc.nextLine();

                    System.out.print("세금 여부 : ");
                    boolean duty = sc.nextBoolean();
                    sc.nextLine();

                    list.add(new MenuInfo(name, price, category,explanation,duty));
                    System.out.println("새 메뉴가 등록되었습니다.");

                    break;

                case 3: // [3] 메뉴 수정
                    System.out.println("수정할 메뉴의 번호를 입력하세요.");
                    System.out.print("입력 : ");
                    idx = sc.nextInt() -1;

                    break;

                case 4: // [4] 메뉴 삭제
                    System.out.println("삭제할 메뉴를 입력해 주세요");
                    System.out.print("입력 : ");
                    String searchName = sc.nextLine();
                    for (MenuInfo e : list) {
                        if (e.getName().contains(searchName)) {
                            list.remove(searchName);
                        } else {
                            System.out.println("없는 메뉴 입니다.");
                        }
                    }

                        break;
                case 5: // [5] 메뉴 검색 - 완
                    System.out.println("검색할 메뉴를 입력해 주세요");
                    System.out.print("입력 : ");
                    searchName = sc.nextLine();
                    for (MenuInfo e : list) {
                        if (e.getName().contains(searchName)) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 6: // [6] 종료
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("메뉴를 잘 못 선택했습니다.");
            }
        }
    }

}



