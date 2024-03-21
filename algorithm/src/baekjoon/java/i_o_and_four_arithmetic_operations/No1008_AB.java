package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No1008_AB {    // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int A = sc.nextInt();   // 정수 A를 입력 받음
        int B = sc.nextInt();   // 정수 B를 입력 받음

        System.out.println((double) A / B); // A를 B로 나눈 값을 출력

        sc.close(); // 시스템 자원 누수를 방지하기 위해 Scanner 개체를 닫는다.
    }
}

/*
 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

 출력 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.

 예제 입력 1 = 1 3
 예제 출력 1 = 0.33333333333333333333333333333333

 예제 입력 2 = 4 5
 예제 출력 2 = 0.8
 */