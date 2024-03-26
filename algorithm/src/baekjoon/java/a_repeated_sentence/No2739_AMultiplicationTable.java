package baekjoon.java.a_repeated_sentence;

import java.util.Scanner;

public class No2739_AMultiplicationTable {  // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int N = sc.nextInt();   // 정수 N을 입력 받음

        for(int i = 1; i <= 9; i++) {   // i는 1부터 9까지 증가
            System.out.println(N + " * " +i + " = " + N * i);   // N과 i를 곱한 결과를 출력
        }
        sc.close(); // Scanner를 닫아서 자원을 해제한다.
    }
}

/*
 문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

 출력 : 출력형식과 같게 N*1부터 N*9까지 출력한다.

 예제 입력 1 = 2
 예제 출력 1 = 2 * 1 = 2
             2 * 2 = 4
             2 * 3 = 6
             2 * 4 = 8
             2 * 5 = 10
             2 * 6 = 12
             2 * 7 = 14
             2 * 8 = 16
             2 * 9 = 18
 */