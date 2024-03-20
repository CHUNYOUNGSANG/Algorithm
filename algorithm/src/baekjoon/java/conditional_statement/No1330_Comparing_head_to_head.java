package baekjoon.java.conditional_statement;


import java.util.Scanner;

public class No1330_Comparing_head_to_head {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성

        int A = sc.nextInt();   // 첫 번째 정수를 입력받아 변수 A에 저장
        int B = sc.nextInt();   // 두 번째 정수를 입력받아 변수 B에 저장

        if (A > B) {    // 만약 A가 B보다 크다면,
            System.out.println(">");    // ">"를 출력 한다.
        } else if (A < B) {    // 그렇지 않고 A가 B보다 작다면
            System.out.println("<");    // "<"를 출력
        } else {
            boolean a = A == B; {   // 그 외, A와 B가 같다면
                System.out.println("==");   // "=="를 출력
            }
        }
        sc.close(); // 시스템 자원 누수를 방지하기 위해 Scanner 개체를 닫는다.
    }
}

/*
 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.

 제한 : -10,000 ≤ A, B ≤ 10,000

 예제입력 1 : 1 2
 예제출력 1 : <

 예제입력 2 : 10 2
 예제출력 2 : >

 예제입력 3 : 5 5
 예제출력 3 : ==
 */


