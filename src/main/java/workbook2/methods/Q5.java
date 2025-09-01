package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
//            System.out.print(words[i] + " ");
        }
        // TODO: reverseStrings 호출 후 결과 출력
        String[] reversed = reverseStrings(words);

        // 결과 출력
        for (String word : reversed) {
            System.out.print(word + " ");
        }
    }

    public static String[] reverseStrings(String[] words) {
        String[] results = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            //StringBuilder로 문자열 뒤집기
            results[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return results;
    }
}