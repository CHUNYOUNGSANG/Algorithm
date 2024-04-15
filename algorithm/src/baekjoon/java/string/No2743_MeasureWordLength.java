package baekjoon.java.string;

import java.util.Scanner;

public class No2743_MeasureWordLength { // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        String a = sc.nextLine();   // 사용자로부터 문자 a를 입력받음

        System.out.println(a.length()); // a의 문자 길이를 출력

        sc.close(); // Scanner 객체 닫기 (자원 누수 방지를 위해)
    }
}

/*
  문제 : 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

  입력 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

  출력 : 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

  예제 입력 1 = pulljima
  예제 출력 1 = 8
 */