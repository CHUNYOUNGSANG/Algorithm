package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No1001_AB {    // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int A = sc.nextInt();   // 첫 번째 정수를 입력 받음
        int B = sc.nextInt();   // 두 번째 정수를 입력 받음

        System.out.println(A - B);  // 두 정수의 차를 출력

        sc.close(); // 시스템 자원 누수를 방지하기 위해 Scanner 개체를 닫는다.
    }
}

/*
 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

 출력 : 첫째 줄에 A-B를 출력한다.

 예제 입력 1 : 3 2
 예제 출력 1 : 1
 */
