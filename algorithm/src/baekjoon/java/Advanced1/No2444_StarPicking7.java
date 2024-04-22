package baekjoon.java.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2444_StarPicking7 {  // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader 객체 생성
        int N = Integer.parseInt(br.readLine());    // 사용자로부터 정수 N을 입력받음
        br.close(); // BufferedReader를 닫음

        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder 객체 생성
        // 상단 삼각형 출력
        for (int i = 1; i <= N; i++) {  // i는 1부터 N까지 반복
            for (int j = 1; j <= N - i; j++) {  // 공백 출력
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {  // 별 출력
                sb.append("*");
            }
            sb.append("\n");    // 줄 바꿈
        }
        // 하단 삼각형 출력
        for (int i = N - 1; i >= 1; i--) {  // i는 N - 1부터 1까지 반복
            for (int j = 1; j <= N - i; j++) {  // 공백 출력
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {  // 별 출력
                sb.append("*");
            }
            sb.append("\n");    // 줄 바꿈
        }
        System.out.println(sb); // 결과 출력
    }
}

/*
 문제 : 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

 출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

 예제 입력 1 = 5
 예제 출력 1 =     *
                ***
               *****
              *******
             *********
              *******
               *****
                ***
                 *
 */