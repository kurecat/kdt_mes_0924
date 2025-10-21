package 해시맵;
// Map key-value 쌍(pair)으로 데이터를 저장하는 자료 구조
// key는 중복될 수 없고, 값은 중복 가능
// list나 배열처럼 순차적인 접근하지 않고, key를 통해 value를 조회

import java.util.HashMap;
import java.util.Scanner;

import static 해시맵.Input.*;

// 기본 메뉴 3개 추가하는 메서드
// [1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료
// 입력구문은 Input으로 다 옮김.
public class HashMapMain {
    private static final HashMap<String, MenuMap>map = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        initMenu();
        while (true){
            System.out.println("메뉴를 선택해 주세요");
            System.out.println("[1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료");
            System.out.print("입력 : ");
            int menuChoice = sc.nextInt();
            sc.nextLine();
            switch (menuChoice){
                case 1: menuList(); break;
                case 2: searchMenu(); break;
                case 3: createMenu(); break;
                case 4: deleteMenu(); break;
                case 5: updateMenu(); break;
                case 6:System.out.println("종료합니다."); return;
                default:System.out.println("메뉴를 잘 못 선택 하셨습니다.");
            }
        }
    }
}