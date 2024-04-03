package baekjoon.java.one_dimensional_array_stage;

import java.io.*;

public class No10871_NumberLessThanX {  // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력

        String[] NX = br.readLine().split(" "); // 첫 번째 줄에서 N과 X를 입력받아 공백을 기준으로 나누어 배열에 저장
        int N = Integer.parseInt(NX[0]);    // N: 수열 A의 크기
        int X = Integer.parseInt(NX[1]);    // X: 비교할 값

        String[] input = br.readLine().split(" ");  // 두 번째 줄에서 수열 A를 공백을 기준으로 나누어 배열에 저장

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(input[i]); // 수열 A의 각 원소를 정수로 변환
            if (A < X) {    // 수열 A의 원소가 X보다 작다면
                bw.write(A + " ");  // 해당 원소를 출력
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

/*
 문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
      둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

 출력 : X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

 예제 입력 1 = 10 5
             1 10 4 9 2 3 8 5 7 6
 예제 출력 1 = 1 4 2 3
 */