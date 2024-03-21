package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No10869_FourBasicOperations {  // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int A = sc.nextInt();   // 정수 A를 입력 받음
        int B = sc.nextInt();   // 정수 B를 입력 받음

        System.out.println(A + B);  // A와 B의 합을 출력
        System.out.println(A - B);  // A와 B의 차를 출력
        System.out.println(A * B);  // A와 B의 곱을 출력
        System.out.println(A / B);  // A를 B로 나눈 몫을 출력
        System.out.println(A % B);  // A를 B로 나눈 나머지를 출력

        sc.close(); // Scanner를 닫아서 자원을 해제한다.
    }
}

/*
 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

 입력 : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

 출력 : 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

 예제 입력 1 = 7 3
 에제 출력 1 = 10
             4
             21
             2
             1
 */