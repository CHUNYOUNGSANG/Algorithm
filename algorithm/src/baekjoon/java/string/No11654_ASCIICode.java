package baekjoon.java.string;

import java.util.Scanner;

public class No11654_ASCIICode {    // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체를 생성

        String st = sc.next();  // 사용자로부터 문자열을 입력받습니다.
        int a = st.charAt(0);   // 문자열의 첫 번째 문자에 해당하는 ASCII 코드를 가져옵니다.

        System.out.println(a);  // ASCII 코드를 출력

        sc.close(); // Scanner를 닫음
    }
}

/*
 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

 입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

 출력 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.

 예제 입력 1 = A
 예제 출력 1 = 65

 예제 입력 2 = C
 예제 출력 2 = 67

 예제 입력 3 = 0
 예제 출력 3 = 48

 예제 입력 4 = 9
 예제 출력 4 = 57

 예제 입력 5 = a
 예제 출력 5 = 97

 에제 입력 6 = z
 예제 출력 6 = 122
 */