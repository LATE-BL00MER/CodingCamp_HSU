/*
HashMap은 key와 value로 이루어져 있음
HashMap<String, Integer> hashmap = new HashMap<> ();
여기서 int, double이 아닌 wrapper클래스를 사용해야 함(Integer, Double)
*/
package Ex07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // HashMap 생성 (도시 : 인구)
        HashMap<String, Integer> cities = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("10개의 도시 이름과 인구수 입력");
        // 데이터 넣기
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번 째 도시 이름: ");
            String city = sc.next();
            sc.nextLine();

            System.out.print((i + 1) + "번째 인구수: ");
            int people = Integer.parseInt(sc.nextLine());

            cities.put(city, people);
        }

        System.out.println("입력 완료: " + cities);
    }
}
