package baekjoon.java.a_repeated_sentence;

import java.util.Scanner;

public class No8393_Sum {   // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int n = sc.nextInt();   // 정수 n을 입력 받음
        int sum = 0;    // 합을 저장할 변수 초기화

        for (int i = 1; i <= n; i++) {  // 1부터 n까지의 숫자를 더하기 위한 반복문
            sum += i;   // 현재 숫자 i를 sum에 더함
        }

        System.out.println(sum);    // 합을 출력
        sc.close(); // Scanner 객체를 닫아 메모리 누수를 방지한다
    }
}

/*
 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

 출력 : 1부터 n까지 합을 출력한다.

 예제 입력 1 = 3
 예제 출력 1 = 6
 */
