package main.java.workbook2.array;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력

        // 1.2 3.5 0.7 5.6 2.1 9.4 4.3 3.3 6.6 0.5

        // 1. 최댓값, 최솟값을 저장할 변수를 만든다.
        // 2. array에 값을 저장한다.
        // 3. 최댓값을 찾는 코드를 작성한다.
        // 4. 최솟값을 찾는 코드를 작성한다.
        // 5. 출력한다.


        double minNum;
        double maxNum;
        int count = 0;



        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            count++;
        }
        minNum = maxNum = arr[0];            // 첫번째 값을 min & max에 넣어줬기 때문에

        for (int i = 1; i < count; i++) {    // 1번째 인덱스부터 시작한다.
            if (arr[i] < maxNum) {
                minNum = arr[i];
            }
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        System.out.println(minNum);
        System.out.println(maxNum);

    }
}
