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
        System.out.println(s); // 변화 없음
        System.out.println(sb); // 원본이 바뀜

    }

    // String은 불변 -> 새로운 문자열을 리턴해야 한다.
    public static void addExclamation(String s) {
        s = s + "!"; // 새로운 객체 생성됨, 원본에는 반영 안됨
    }

    // StringBuilder는 가변 -> 원본이 직접 바뀜
    public static void addExclamation(StringBuilder sb) {
        sb.append("!"); // 원본 자체가 수정됨
    }
}