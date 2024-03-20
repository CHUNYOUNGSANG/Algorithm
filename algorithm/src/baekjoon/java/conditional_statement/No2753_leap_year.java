package baekjoon.java.conditional_statement;

import java.util.Scanner;

public class No2753_leap_year {
    public static void main(String[] args) {    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 사용자로부터 정수를 입력

        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) { // 입력된 년도가 운년인지 확인
            System.out.println("1");    // 만약 년도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어진다면, 윤년이다.
        } else {
            System.out.println("0");    // 그렇지 않으면, 윤년이 아니다.
        }
        sc.close(); // 시스템 자원 누수를 방지하기 위해 Scanner 개체를 닫는다.
    }
}

/*
 문제 : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
      윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
      예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
      하지만, 2000년은 400의 배수이기 때문에 윤년이다.

 입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

 출력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

 예제입력 1 : 2000
 예제출력 1 : 1

 예제입력 2 : 1999
 예제출력 2 : 0
 */

