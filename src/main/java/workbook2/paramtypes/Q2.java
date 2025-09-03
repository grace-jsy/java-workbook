package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int[] result = addHundred(arr); // TODO: addHundred 메서드 작성 후 주석 해제
        // TODO: 변경된 arr 출력

        for(int i = 0; i < arr.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] addHundred(int[] arr) {
        int[] result = new int[arr.length];

        result[0] = arr[0] + 100;

        for (int i = 1; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}

/*

1. 메서드 안에서 새로운 배열 객체를 만든다.
(이 때 배열의 길이는 매개변수로 받는다.)

2. 메서드 안에 있는 첫 번째 배열에 매개변수로 받아온 배열의 첫번째값 + 100을 해준다.

3. for문을 사용해서 나머지 숫자들은 그대로 복사해준다.

4. 메인 메서드에서 호출한 메서드를 새로운 result[]에 담다준다.

5. for문을 사용해서 result[]를 출력한다.

 */