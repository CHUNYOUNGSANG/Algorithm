package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No10430_Remainder {    // 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성

        int A = sc.nextInt();   // 정수 A를 입력 받음
        int B = sc.nextInt();   // 정수 B를 입력 받음
        int C = sc.nextInt();   // 정수 C를 입력 받음

        System.out.println((A + B) % C);    // (A + B)를 C로 나눈 나머지 출력
        System.out.println(((A % C) + (B % C)) % C);    // (A를 C로 나눈 나머지 + B를 C로 나눈 나머지)를 C로 나눈 나머지 출력
        System.out.println((A * B) % C);    // A와 B의 곱을 C로 나눈 나머지 출력
        System.out.println(((A % C) * (B % C)) % C);    // (A를 C로 나눈 나머지 * B를 C로 나눈 나머지)를 C로 나눈 나머지 출력

        sc.close(); // Scanner 객체 닫기.
    }

}

/*
 문제 : (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
      (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
      세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

 출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

 예제 입력 1 = 5 8 4
 예제 출력 1 = 1
             1
             0
             0

 */

