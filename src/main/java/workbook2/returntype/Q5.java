package main.java.workbook2.returntype;

import java.util.Scanner;

import static main.java.workbook2.returntype.Person.olderPerson;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person olderPerson(Person p1, Person p2) {
        if(p1.age > p2.age) {
            return p1;
        } else {
            System.out.println(p2.name + " " + p2.age);
        } return p2;
    }
}

public class Q5 {
    // TODO: olderPerson 메서드 작성 (두 Person 중 나이가 더 많은 객체를 반환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번 Person의 이름과 나이
        String name1 = sc.next();
        int age1 = sc.nextInt();

        // 2번 Person의 이름과 나이
        String name2 = sc.next();
        int age2 = sc.nextInt();

        // 1번 & 2번 객체 생성
        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);

         Person older = olderPerson(p1, p2); // TODO: olderPerson 메서드 작성 후 주석 해제
        // TODO: older.name과 older.age 출력

        System.out.println(older.name + " " + older.age);
    }
}