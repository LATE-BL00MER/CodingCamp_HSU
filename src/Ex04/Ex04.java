/*
정답과 숫자 리스트가 입력되었을 때, 더했을 때, 정답과 일치하는
리스트 내 두 개의 숫자에 대한 위치 (index) 값을 반환하라.

<주의 1>
입력된 숫자 리스트 중 조건에 맞고하는 정답은 항상 하나만 존재한다고 가정

<주의 2>
입력된 숫자 리스트의 숫자는 중복되서 쓰일 수 없다.
*/

package Ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("정답을 입력하세요:");
        int target = scn.nextInt();

        System.out.println("배열의 크기를 입력하세요:");
        int index = scn.nextInt();

        int[] arr = new int[index];
        int i;
        System.out.println("배열의 입력값을 띄어쓰기를 활용하여 입력하세요:");
        for (i = 0; i < index; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("결과: " + Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // 중복되지 않는 하나의 숫자를 출력하는 코드...
        // 만약? 중복되는 수가 있다면? 그 수를 제외하고 출력하면 되는 원리?
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if ()
            }
        }


    }
}
