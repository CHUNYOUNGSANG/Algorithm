package baekjoon.java.i_o_and_four_arithmetic_operations;

import java.util.Scanner;

public class No2588_Multiplication {    // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int a = sc.nextInt();   // 정수 a를 입력 받음
        int b = sc.nextInt();   // 정수 b를 입력 받음

        System.out.println(a * (b % 10));   // b를 10으로 나눈 나머지(일의 자리)를 a와 곱한 값을 출력
        System.out.println(a * (b % 100 / 10)); // b를 100으로 나눈 나머지를 10으로 나눈 몫(십의 자리)을 a와 곱한 값을 출력
        System.out.println(a * (b / 100));  // b를 100으로 나눈 몫(백의 자리)을 a와 곱한 값을 출력
        System.out.println(a * b);  // 두 수를 곱한 값을 출력

        sc.close(); // Scanner를 사용한 입력이 모두 끝났으므로 리소스를 반환한다.
    }
}

/*
 문제 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
      (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

 입력 : 첫쨰 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

 출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

 예제 입력 1 = 472
             385
 예제 출력 1 = 2360
             3376
             1416
             181720
 */