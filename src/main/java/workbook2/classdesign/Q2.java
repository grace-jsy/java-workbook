package main.java.workbook2.classdesign;

import java.util.Scanner;

class Circle {
    static double r;
    // new를 해야 존재함
    // 인스턴스변수

    static double pi = 3.14;
    // new를 하지 않아도 모든 객체가 참조함


    // TODO: 생성자 작성
    Circle(double r) {
        this.r = r;
    }

    // 클래스 메서드
    static double getCircumference() {
        // TODO: 둘레 반환
        return 2 * Math.PI * r;
    }

}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

         Circle c = new Circle(radius); // TODO: 생성자 작성 후 주석 해제
        // TODO: c.getCircumference() 출력
        double result = c.getCircumference();
        Circle.getCircumference();

        System.out.println(result);
    }
}
