package main.java.workbook2.array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력

        // 1. 입력 값을 저장할 배열을 만든다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. 버블 정렬을 실행한다.
        for (int pass = 0; pass < n - 1; pass++) {
            for (int j = 0; j < n - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 3. 정렬된 배열 출력
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}