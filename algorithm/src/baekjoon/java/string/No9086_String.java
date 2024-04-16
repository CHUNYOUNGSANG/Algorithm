package baekjoon.java.string;

import java.util.Scanner;

public class No9086_String {    // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체를 생성
        int T = sc.nextInt();   // 테스트 케이스의 개수를 입력 받음

        for (int i = 0; i < T; i++) {
            String a = sc.next();   // 다음으로 입력되는 문자열을 읽어와 변수 a에 저장
            System.out.println(a.charAt(0) + "" + a.charAt(a.length() - 1));    // 문자열의 첫 번째 문자와 마지막 문자를 출력


        }
        sc.close(); // Scanner 닫음
    }
}

/*
 문제 : 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

 입력 : 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
      문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

 출력 : 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

 예제 입력 1 = 3
             ACDKJFOWIEGHE
             O
             AB
 예제 출력 1 = AE
             OO
             AB
 */