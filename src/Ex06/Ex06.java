package Ex06;

class ArrayInt {

    // 인스턴스화 방지
    private ArrayInt() {}

    // 배열 a를 배열 b에 복사
    public static void copy(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    // 배열 a와 b를 비교해서 true, false 리턴
    public static boolean compare(int a[], int b[]) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;

        // return Arrays.equals(a, b) --> 이렇게도 써야 함
    }

    // 배열 a의 합을 리턴
    public static int sum(int a[]) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
           result += a[i];
        }
        return result;
    }

    // String []을 리턴한다
    public static String toString(int a[]) {
        String result = "[";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
            if (i < a.length - 1) { // 마지막 요소가 아니면 쉼표 추가
                result += ", ";
            }
        }
        return result + "]";
    }

    // 배열 a[]를 정렬하여 리턴한다.
    public static int sort(int a[]) {
        // 바깥 반복문: 전체적으로 몇 번 훑을지 결정
        for (int i = 0; i < a.length - 1; i++) {

            // 안쪽 반복문: 인접한 두 숫자가 비교하며 큰 숫자를 뒤로 보냄
            for (int j = 0; j < a.length - 1; j++) {

                // 앞의 숫자가 뒤보다 크다면?
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // 리턴 타입이 int이므로, 정렬된 배열이 길이 리턴
        return a.length;
    }

    // 배열 a와 b를 정렬해 새로 정렬된 배열을 리턴
    public static int merge(int a[], int b[]) {
        // 두 배열의 길이를 합친 새로운 배열 생성
        int[] result = new int[a.length + b.length];

        // a의 데이터들을 result에 복사
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        // b의 데이터들을 result에 복사
        for (int i =  0; i < b.length; i++) {
            // result의 인덱스를 [a.length + i]로 지정하는 게 핵심!!!
            // a.length + i 인 이유는
            /*
            a의 길이가 3이고 b의 길이가 2라면
            a는 result[0,1,2]에 들어가는데
            b는 result[3, 4]에 들어가야 함
             */
            result[a.length + i] = b[i];
        }

        // 위의 sort()메소드 활용해서 합쳐진 배열 정렬
        sort(result);

        // 정렬된 결과 확인을 위해 toString으로 찍어야 함
        System.out.println("합쳐지고 정렬된 결과: " + toString(result));

        // 합쳐진 배열의 길이나 특정 결과 리턴
        return result.length;
    }
}

public class Ex06 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 1};
        int[] arr2 = {10, 20};

        // 객체를 생성하지 않고 ArrayInt의 메소드 사용
        int total = ArrayInt.sum(arr1); // 합게 구하기
        System.out.println("합계: " + total);

        ArrayInt.sort(arr1);

        String str = ArrayInt.toString(arr1); // 문자열로 바꾸기
        System.out.println("정렬된 배열: " + str);

        ArrayInt.merge(arr1, arr2);
    }
}
