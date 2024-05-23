package baekjoon.java.factors_multiples_and_decimal_steps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No5086_MultiplesAndDivisors {
    public static void main(String[] args) throws IOException {
        // 결과 문자열을 정의합니다: factor(약수), multiple(배수), neither(둘 다 아님)
        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";

        // 표준 입력(키보드)으로부터 입력을 읽기 위해 BufferedReader를 생성합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 결과를 누적할 StringBuilder를 생성합니다.
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 무한 루프를 사용하여 각 입력 쌍을 처리합니다.
        while (true) {
            // 한 줄의 입력을 읽고 토큰으로 나눕니다.
            st = new StringTokenizer(br.readLine());

            // 입력에서 두 정수를 파싱합니다.
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 두 정수가 모두 0이면 루프를 종료합니다.
            if (a == 0 && b == 0) {
                break;
            }

            // 'a'가 'b'의 약수인지 확인합니다.
            if (b % a == 0) {
                sb.append(f); // 결과에 "factor"를 추가합니다.
            } else if (a % b == 0) { // 'b'가 'a'의 약수인지 확인합니다.
                sb.append(m); // 결과에 "multiple"을 추가합니다.
            } else {
                sb.append(n); // 둘 다 아니면 결과에 "neither"를 추가합니다.
            }
        }

        // 누적된 결과를 출력합니다.
        System.out.println(sb);
        br.close();
    }
}

/*
 문제 : 4 × 3 = 12이다.
      이 식을 통해 다음과 같은 사실을 알 수 있다.
      3은 12의 약수이고, 12는 3의 배수이다.
      4도 12의 약수이고, 12는 4의 배수이다.
      두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
      1. 첫 번째 숫자가 두 번째 숫자의 약수이다.
      2. 첫 번째 숫자가 두 번째 숫자의 배수이다.
      3. 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.

 입력 : 입력은 여러 테스트 케이스로 이루어져 있다.
      각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다.
      마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.

 출력 : 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.

 예제 입력 1 = 8 16
            32 4
            17 5
            0 0
 에제 출력 1 = factor
            multiple
            neither
 */
