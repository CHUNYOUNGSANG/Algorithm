package baekjoon.java.general_mathematics_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No11005_DecimalConversion2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        br.close();

        ArrayList<Character> list = new ArrayList<>();

        while (N > 0) {
            if (N % B < 10) {
                list.add((char) (N % B + '0'));

            }

            else {
                list.add((char) (N % B - 10 + 'A'));
            }

            N /= B;

        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));

        }
    }
}

/*
 문제 : 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
      10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
      A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

 입력 : 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

 출력 : 첫째 줄에 10진법 수 N을 B진법으로 출력한다.

 예제 입력 1 = 60466175 36
 예제 출력 1 = ZZZZZ
 */