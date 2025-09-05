package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            // 배열 크기 입력
        int[] original = new int[n];

        for (int i = 0; i < n; i++) {    // 원본 배열 입력
            original[i] = sc.nextInt();
        }

        // 복사본 생성
         int[] copy = copyArray(original); // TODO: copyArray 메서드 작성 후 주석 해제

        // 원본 배열 변경
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        // TODO: copy 배열을 출력
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
    }

    public static int[] copyArray(int[] arr) {

        return arr.clone();

    }
}