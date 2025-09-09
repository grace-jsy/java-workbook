package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;
    // TODO: 생성자 및 addSeconds 메서드 작성

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void addSeconds(int add) {
        int totalSeconds = hour * 3600 + minute * 60 + second;
        totalSeconds += add;

        // 하루(24시간 = 86400초) 기준으로 나머지 처리
        totalSeconds %= 86400;

        // 다시 시/분/초 계산
        hour = totalSeconds / 3600;
        minute = (totalSeconds % 3600) / 60;
        second = totalSeconds % 60;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();
         Time time = new Time(h, m, s); // TODO: 생성자 작성 후 주석 해제
         time.addSeconds(add); // TODO: addSeconds 메서드 작성 후 주석 해제
        // TODO: time.hour time.minute time.second 출력
        System.out.println(time.hour + " " + time.minute + " " + time.second);
    }
}