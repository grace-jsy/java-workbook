package main.java.workbook2.methods;

import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: factorial 호출 후 결과 출력

        long result = factorial(n);
        System.out.println(result);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N should be greater than 0");
        }
        if (n == 0 || n == 1) { // 기저 사례
            return 1L;
        }
        return n * factorial(n - 1);
    }
}
