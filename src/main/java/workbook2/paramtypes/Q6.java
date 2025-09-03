package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());
         addExclamation(s); // TODO: addExclamation(String s) 메서드 작성 후 주석 해제
         addExclamation(sb); // TODO: addExclamation(StringBuilder sb) 메서드 작성 후 주석 해제

        // TODO: s와 sb 출력
        System.out.println(s);   // 변하지 않음
        System.out.println(sb);  // 객체의 주소값을 전달했기 때문에 값이 변함
    }

    public static void addExclamation(String s) {
        s = s + "!";
    }

    public static void addExclamation(StringBuilder sb) {
        sb.append("!");
    }
}