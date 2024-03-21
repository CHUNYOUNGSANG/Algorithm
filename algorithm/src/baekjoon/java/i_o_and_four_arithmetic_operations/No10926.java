package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No10926 {  // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        String str = sc.next(); // 문자를 입력받음

        System.out.println(str + "??!");    // 문자 + ??!를 출력

        sc.close(); // Scanner를 닫아서 자원을 해제한다.
    }
}

/*
 문제 : 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다.
      준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다.
      아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.

 출력 : 첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.

 예제 입력 1 : joonas
 예제 출력 1 : joonas??!

 예제 입력 2 : baekjoon
 예제 출력 2 : baekjoon??!
 */
