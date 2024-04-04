package baekjoon.java.one_dimensional_array_stage;

import java.util.Arrays;
import java.util.Scanner;

public class No10818_MinMax {   // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체를 생성하여 키보드 입력을 받을 준비를 함

        int N = sc.nextInt();   // 입력으로 받을 숫자의 개수를 사용자에게 요청
        int[] arr = new int[N]; // 입력받은 숫자들을 저장할 배열을 선언

        for (int i = 0; i < N; i++) {   // N번 반복하면서 사용자로부터 숫자를 입력받아 배열에 저장
            arr[i] = sc.nextInt();
        }
        sc.close(); // 입력이 끝났으므로 Scanner를 닫음
        Arrays.sort(arr);   // 배열을 정렬하여 최솟값과 최댓값을 구함
        System.out.println(arr[0] + " " + arr[N - 1]);  // 정렬된 배열의 첫 번째 값(최솟값)과 마지막 값(최댓값)을 출력
    }
}

/*
 문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
      모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

 출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

 예제 입력 1 = 5
             20 10 35 30 7
 예제 출력 1 = 7 35
 */