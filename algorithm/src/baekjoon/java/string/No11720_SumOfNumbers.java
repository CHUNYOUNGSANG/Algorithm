package baekjoon.java.string;

import java.util.Scanner;

public class No11720_SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        int N = sc.nextInt();   // 정수 N 입력
        String a = sc.next();   // 숫자로 이루어진 문자열 입력
        sc.close(); // Scanner 객체 닫기

        int sum = 0;    // 합을 저장할 변수 초기화

        for (int i = 0; i < N; i++) {   // 문자열의 각 자리 숫자를 합산
            sum += a.charAt(i) - 48;    // 문자열에서 i번째 문자를 가져와서 '0', -48을 빼서 해당 숫자 값이 나온다.
        }
        System.out.println(sum);    // 합 출력
    }
}

/*
 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.

 예제 입력 1 = 1
             1
 예제 출력 1 = 1

 에제 입력 2 = 5
             54321
 예제 출력 2 = 15

 예제 입력 3 = 25
             7000000000000000000000000
 예제 출력 3 = 7

 예제 입력 4 = 11
             10987654321
 예제 출력 4 = 46
 */