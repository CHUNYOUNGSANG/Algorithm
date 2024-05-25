package baekjoon.java.factors_multiples_and_decimal_steps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2501_FindingDivisors {
    public static void main(String[] args) throws IOException {
        // 표준 입력(키보드)으로부터 입력을 읽기 위해 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 줄을 읽고 공백을 기준으로 문자열을 나누기 위해 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 첫 번째 토큰을 정수 N으로 파싱 (약수를 찾을 숫자)
        int N = Integer.parseInt(st.nextToken());

        // 두 번째 토큰을 정수 K로 파싱 (찾고자 하는 K번째 약수)
        int K = Integer.parseInt(st.nextToken());

        // 찾은 약수의 개수를 세기 위한 변수 초기화
        int count = 0;

        // 결과(즉, K번째 약수)를 저장할 변수 초기화
        int result = 0;

        // 1부터 N까지 반복하여 N의 모든 약수를 찾음
        for(int i = 1; i <= N; i++){
            // i가 N의 약수인지 확인
            if(N % i == 0) {
                // 약수를 찾으면 카운트를 증가
                count++;

                // 현재 약수가 K번째 약수이면, result에 저장하고 반복 종료
                if(count == K){
                    result = i;
                    break;
                }
            }
        }

        // K번째 약수를 출력 (K번째 약수가 없으면 0 출력)
        System.out.print(result);

        // BufferedReader를 닫아 자원을 해제
        br.close();
    }
}

/*
 문제 : 어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.
      6을 예로 들면

      1. 6 ÷ 1 = 6 … 0
      2. 6 ÷ 2 = 3 … 0
      3. 6 ÷ 3 = 2 … 0
      4. 6 ÷ 4 = 1 … 2
      5. 6 ÷ 5 = 1 … 1
      6. 6 ÷ 6 = 1 … 0

      그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
      두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.

 출력 : 첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.

 예제 입력 1 = 6 3
 예제 출력 1 = 3

 예제 입력 2 = 25 4
 예제 출력 2 = 0

 에제 입력 3 = 2735 1
 예제 출력 3 = 1
 */