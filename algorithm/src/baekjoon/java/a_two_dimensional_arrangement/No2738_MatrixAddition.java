package baekjoon.java.a_two_dimensional_arrangement;

import java.util.Scanner;;

public class No2738_MatrixAddition {    // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 콘솔에서 입력을 읽어오기 위해 Scanner 객체 생성

        int n = sc.nextInt();   // 행의 수를 나타내는 정수를 읽어옴
        int m = sc.nextInt();   // 열의 수를 나타내는 정수를 읽어옴
        int[][] arr = new int[n][m];    // 행렬 요소를 저장하기 위한 2차원 배열 생성

        for (int i = 0; i < n; i++) {   // 첫 번째 행렬의 값을 읽어오기 위한 반복문
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();   // 첫 번째 행렬의 값을 읽어와 배열에 저장
            }
        }

        for (int i = 0; i < n; i++) {   // 두 번째 행렬의 값을 첫 번째 행렬의 해당 요소에 더해주기 위한 반복문
            for (int j = 0; j < m; j++) {
                arr[i][j] += sc.nextInt();  // 두 번째 행렬의 값을 첫 번째 행렬의 해당 요소에 더함
                System.out.print(arr[i][j] + " ");  // 결과 행렬 출력
            }
            System.out.println();   // 각 행을 출력한 후에는 다음 줄로 이동
        }
        sc.close(); // 자원을 해제하기 위해 Scanner 객체를 닫음
    }
}

/*
 문제 : N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
      이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

 출력 : 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

 예제 입력 1 = 3 3
            1 1 1
            2 2 2
            0 1 0
            3 3 3
            4 4 4
            5 5 100
 예제 출력 1 = 4 4 4
            6 6 6
            5 6 100
 */