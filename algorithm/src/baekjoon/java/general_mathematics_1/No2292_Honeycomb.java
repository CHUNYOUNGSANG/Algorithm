package baekjoon.java.general_mathematics_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2292_Honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader를 사용하여 입력을 받음
        int N = Integer.parseInt(br.readLine());    // 입력된 숫자를 읽어 정수로 변환
        int count = 1;  // 벌집의 최소 경로의 길이
        int range = 1;  // 벌집 범위의 마지막 숫자

        if (N == 1) {   // 입력된 N이 1인 경우, 이미 중앙 방에 있으므로 1을 출력
            System.out.print(1);
        } else {
            while (range < N) { // 입력된 N이 현재 범위 내에 속할 때까지 루프를 반복
                range += (6 * count);   // 다음 범위의 마지막 숫자를 계산 (6의 배수로 증가)
                count++;    // 벌집의 최소 경로의 길이를 증가
            }
            System.out.print(count);    // 범위가 N 이상이 되면, 최소 경로의 길이를 출력
        }
        br.close(); // BufferedReader를 닫음
    }
}

/*
 문제 : 위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
      숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
      예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

 입력 : 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.

 출력 : 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

 예제 입력 1 = 13
 예제 출력 1 = 3

 */
