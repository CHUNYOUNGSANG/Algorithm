package baekjoon.java.general_mathematics_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1193_FindingAFountain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader를 사용하여 입력을 받습니다.
        int X = Integer.parseInt(br.readLine());    // 사용자가 입력한 값을 읽어들여 정수로 변환합니다.

        int diagonal = 1; // 대각선 번호를 저장하는 변수입니다. 처음에는 1로 초기화합니다.
        int sum = 0; // 현재까지의 대각선 합을 저장하는 변수입니다.

        while (sum < X) {   // X가 포함된 대각선 번호를 찾기 위한 while 루프입니다.
            sum += diagonal;    // 대각선 번호만큼 더합니다.
            diagonal++; // 대각선 번호를 증가시킵니다.
        }

        // while 루프가 종료된 후, 대각선 번호를 조정합니다.
        diagonal--; // 대각선 번호가 하나 더 증가된 상태이므로, 다시 감소시킵니다.
        int position = X - (sum - diagonal); // 대각선의 합에서 현재 대각선 번호를 뺀 값을 X에서 뺍니다.

        int numerator, denominator; // 분자와 분모를 저장할 변수입니다.

        // 대각선 번호가 짝수인지 홀수인지에 따라 분자와 분모를 결정합니다.
        if (diagonal % 2 == 0) {
            // 대각선 번호가 짝수이면 분자는 position, 분모는 diagonal - position + 1입니다.
            numerator = position;
            denominator = diagonal - position + 1;
        } else {
            // 대각선 번호가 홀수이면 분자는 diagonal - position + 1, 분모는 position입니다.
            numerator = diagonal - position + 1;
            denominator = position;
        }

        System.out.println(numerator + "/" + denominator);  // 결과를 출력합니다.

        br.close(); // BufferedReader를 닫습니다.

    }
}

/*
 문제 : 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

            1/1	1/2	1/3	1/4	1/5	…
            2/1	2/2	2/3	2/4	…	…
            3/1	3/2	3/3	…	…	…
            4/1	4/2	…	…	…	…
            5/1	…	…	…	…	…
            …	…	…	…	…	…

      이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
      X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

 출력 : 첫째 줄에 분수를 출력한다.

 예제 입력 1 = 1
 예제 출력 1 = 1/1

 예제 입력 2 = 2
 예제 출력 2 = 1/2

 예제 입력 3 = 3
 예제 출력 3 = 2/1

 예제 입력 4 = 4
 예제 출력 4 = 3/1

 예제 입력 5 = 5
 예제 출력 5 = 2/2

 예제 입력 6 = 6
 예제 출력 6 = 1/3

 예제 입력 7 = 7
 예제 출력 7 = 1/4

 예제 입력 8 = 8
 예제 출력 8 = 2/3

 예제 입력 9 = 9
 예제 출력 9 = 3/2

 예제 입력 10 = 14
 예제 출력 10 = 2/4

 */