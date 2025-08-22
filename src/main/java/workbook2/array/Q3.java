package main.java.workbook2.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력

        // 1. 일단 1 - 5 까지의 숫자를 차례대로 출력한다.
        // 그 다음 역순으로 출력하는 코드를 작성한다.

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }

    }
}