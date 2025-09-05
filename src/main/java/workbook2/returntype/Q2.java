package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q2 {
    // TODO: toUpper 메서드 작성 (문자열을 대문자로 반환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // TODO: toUpper 호출 후 결과 출력

        String upperStr = toUpper(str);
        System.out.println(upperStr);
    }


    public static String toUpper(String str) {
        return str.toUpperCase();
    }
}