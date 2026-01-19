/*
100에서 200 사이의 숫자 10개를 랜덤하게 생성해 배열에 저장하고 평균을 출력하라
*/
package Ex01;

import java.util.Arrays;

public class No_01 {
    public static void main(String[] args) {
        int result = 0; // 배열의 모든 값에 대한 총합
        double avg = 0; // 평균값

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            // 100부터 200까지의 랜덤 수 생성
            int random = (int)(Math.random() * 101) + 100;

            // 이 부분을 생각 못함..
            arr[i] = random; // 생성한 숫자를 배열에 저장

            result += arr[i];
        }

        avg = (double) result / arr.length;

        // 배열 안에 있는 내용을 대괄호 안에 , 로 구부냏서 나타내주기 위해 Arrays.toString() 사용
        System.out.println("배열: " + Arrays.toString(arr));
        System.out.println("평균: " + avg);
    }
}
