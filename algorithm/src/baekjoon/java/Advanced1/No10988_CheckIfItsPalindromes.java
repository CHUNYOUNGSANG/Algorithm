package baekjoon.java.Advanced1;

import java.io.*;

public class No10988_CheckIfItsPalindromes {    // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();   // 입력된 문자열을 읽음.
        StringBuilder st = new StringBuilder(a);    // StringBuilder 객체를 생성하고 입력된 문자열을 할당함
        br.close();

        if (a.equals(st.reverse().toString())) {    // 입력된 문자열을 뒤집은 후 문자열로 변환하여 원래 문자열과 비교함
            System.out.print(1);    // 맞을 시 1을 출력
        } else
            System.out.print(0);    // 그 외 0 출력
    }
}

/*
 문제 : 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
      팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
      level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

 입력 : 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

 출력 : 첫째 줄에 팰린드롬이면 1, 아니면 0 을 출력한다.

 예제 입력 1 = level
 예제 출력 1 = 1

 예제 입력 2 = baekjoon
 예제 출력 2 = 0
 */