package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No1000_AB {    // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int A = sc.nextInt();   // 정수 A를 입력받음
        int B = sc.nextInt();   // 정수 B를 입력받음

        System.out.println(A + B);  // A와 B를 더한 값을 출력

        sc.close(); // Scanner를 닫음
    }
}

/*
 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오

 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

 출력 : 첫째 줄에 A+B를 출력한다.

 예제 입력 1 : 1 2
 에제 출력 1 : 3
 */
