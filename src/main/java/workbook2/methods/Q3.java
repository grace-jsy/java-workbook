package main.java.workbook2.methods;

import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("count numbers: ");
        int n = sc.nextInt(); // = 3

        int[] arr1 = new int[n]; // [] [] []
        int[] arr2 = new int[n]; // [] [] []

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // TODO: addArrays 호출 후 결과 배열 출력
        int[] result = addArrays(arr1, arr2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}
