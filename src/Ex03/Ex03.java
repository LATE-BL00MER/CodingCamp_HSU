/*
두 개의 정수 배열이 같은지 판별하는 equallnt(int[], int[])를 작성하고,
두 개의 정수 배여릉ㄹ 만들고 equallnt() 함수를 호출해 판별하는 main()함수로 작성
*/
package Ex03;


public class Ex03 {
    // 두 배열이 같은지 확인하는 메서드
    public static int eqaullant(int[] arr1, int[] arr2) {

        // 배열의 길이가 다르면 무조건 다른 배열임
        if (arr1.length != arr2.length) {
            return 0; // 다르다는 의미로 0 변환...
        }

        // 반복문을 돌며 각 요소가 같은지 비교
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return 0; // 하나라도 다르면 0 반환
            }
        }

        // 모든 관문 통과 시 같은 배열
        return 1; // 같다는 의미로 1 반환
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};

        System.out.println("a와 b 비교: " + eqaullant(a, b)); // 결과 1
        System.out.println("a와 c 비교: " + eqaullant(a, c)); // 결과 0
    }
}
