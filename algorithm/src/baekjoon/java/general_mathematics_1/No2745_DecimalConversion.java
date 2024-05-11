package baekjoon.java.general_mathematics_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2745_DecimalConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력으로 주어진 숫자와 기수를 가져옵니다.
        String N = st.nextToken();  // 변환할 숫자
        int B = Integer.parseInt(st.nextToken());   // 기수

        int ans = 0;    // 결과값을 저장할 변수
        int tmp = 1;    // 각 자릿수의 가중치를 저장할 변수

        // 숫자를 거꾸로 읽어가며 각 자리의 값을 계산합니다.
        for (int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);

            // 알파벳일 경우에는 10진수로 변환하여 계산합니다.
            if('A' <= ch && ch <= 'Z') {
                ans += (ch - 'A' + 10) * tmp;
            }

            // 숫자일 경우에는 해당 숫자 그대로를 이용하여 계산합니다.
            else {
                ans += (ch - '0') * tmp;
            }

            tmp *= B;   // 다음 자릿수의 가중치를 곱해줍니다.

        }

        System.out.println(ans);    // 결과값을 출력합니다.
        br.close(); // BufferedReader 닫음

    }
}

/*
 문제 : B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
      10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
      A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

 입력 : 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
      B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

 출력 : 첫째 줄에 B진법 수 N을 10진법으로 출력한다.

 예제 입력 1 = ZZZZZ 36
 예제 출력 1 = 60466175
 */
