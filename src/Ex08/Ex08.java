package Ex08;

import java.util.HashMap;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();

        System.out.println("이름과 전화번호를 입력");
        // 데이터 넣기
        // 반복 개수가 정해지지 않았기에 while로 반복
        while(true) {
            System.out.print("이름 입력>>");
            String name = sc.nextLine();

            if (name.equals("그만")) break;

            System.out.print(name + "의 전화번호 입력>>");
            String phoneNum = sc.nextLine();

            // HashMap에 저장
            phonebook.put(name, phoneNum);
        }

        System.out.println("\n 전체 연락처 목록 ");
        for (String key : phonebook.keySet()) {
            System.out.println("이름: " + key + ", 전화번호: " + phonebook.get(key));
        }
    }
}
