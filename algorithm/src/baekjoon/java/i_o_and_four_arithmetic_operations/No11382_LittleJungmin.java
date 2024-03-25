package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No11382_LittleJungmin {    // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        long A = sc.nextLong();   // 정수 A를 입력 받음        Int 범위를 초과했기 떄문에 long 함수를 사용함
        long B = sc.nextLong();   // 정수 B를 입력 받음
        long C = sc.nextLong();   // 정수 C를 입력 받음

        System.out.println(A + B + C);  // A와 B와 C를 더한 값을 출력

        sc.close();    // Scanner를 닫아서 자원을 해제한다.
    }
}

/*
 문제 : 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

 입력 : 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

 출력 : A+B+C의 값을 출력한다.

 예제 입력 1 = 77 77 7777
 예제 출력 1 = 7931
 */