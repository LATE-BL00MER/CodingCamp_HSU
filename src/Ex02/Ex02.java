/*
비어있지 않은 정수 배열이 입력되었을 때, 배열 내 존재하는 모든 숫자는 단 하나의 숫자만
제외하고 모두 두번 나타난다. 이 때 중복되지 않는 하나의 숫자를 출력하라
*/
package Ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하세요: ");
        int index = scn.nextInt();

        int[] arr = new int[index];

        int i;
        System.out.println("배열의 입력값을 띄어쓰기를 활용하여 입력하시오: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("결과: " + singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        // 중복되지 않는 하나의 숫자를 출력하는 코드...
        // 만약? 중복되는 수가 있다면? 그 수를 제외하고 출력하면 되는 원리?

        for (int i  = 0; i < nums.length; i++) {
            int count = 0; // i 번째 숫자가 몇 개 있는지 체크

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // 만약 자기 자신만 발견되었다면 그게 정답
            if (count == 1) {
                return nums[i];
            }
        }
        return -1; // 찾지 못한 경우
    }
}
