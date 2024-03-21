package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No1001_AB {    // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A - B);

        sc.close();
    }
}

/*
 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

 출력 : 첫째 줄에 A-B를 출력한다.

 예제 입력 1 : 3 2
 예제 출력 1 : 1
 */
