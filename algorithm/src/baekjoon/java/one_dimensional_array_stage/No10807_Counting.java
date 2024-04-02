package baekjoon.java.one_dimensional_array_stage;

import java.util.Scanner;

public class No10807_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체를 생성하여 입력을 받음
        int N = sc.nextInt();    // N 값을 입력 받음
        int count = 0;  // count 변수를 초기화
        int[] arr = new int[N]; // 크기가 N인 정수 배열을 생성

        for (int i = 0; i < N; i++) {   // N개의 정수를 입력받아 배열 arr에 저장
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();   // 정수 b를 입력 받음

        for (int j = 0; j < arr.length; j++) {  // 배열 arr을 순회하면서 b와 같은 값을 가진 요소의 개수를 세어 count에 저장
            if(b == arr[j]) {
                count++;
            }
        }
        System.out.println(count);  // b와 같은 값을 가진 요소의 개수를 출력
    }
}

/*
 문제 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다.
      셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
      입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

 출력 : 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

 예제 입력 1 = 11
             1 4 1 2 4 2 4 2 3 4 4
             2
 예제 출력 1 = 3
 */