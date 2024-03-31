package baekjoon.java.a_repeated_sentence;

import java.io.*;

public class No2439_StarPicking2 {  // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력을 위한 BufferedReader 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위한 BufferedWriter 객체 생성

        int N = Integer.parseInt(br.readLine());    // 사용자로부터 숫자 N을 입력받음.
        br.close(); // BufferedReader를 닫음

        for (int i = 1; i <= N; i++) {  // i는 1부터 N까지 반복
            for(int j = 1; j <= N - i; j++) {   // j는 1부터 N - i까지 반복 (공백 출력)
                bw.write(" ");  // 공백을 출력
            }
            for (int k = 1; k <= i; k++) {  // k는 1부터 i까지 반복
                bw.write("*");  // 별표를 출력
            }
            bw.newLine();   // 한 줄 출력이 끝나면 새로운 줄로 이동
        }
        bw.flush(); // BufferedWriter의 버퍼를 비워서 출력
        bw.close(); // BufferedWriter를 닫음
    }
}

// 작은따옴표를 사용할 때에는 단일 문자를 출력하는 것에 유의해야 합니다. ' '
// 만약에 여러 문자로 이루어진 문자열을 출력하려면 큰따옴표를 사용해야 합니다. " "

/*
 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
      하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

 예제 입력 1 = 5
 예제 출력 1 =    *
               **
              ***
             ****
            *****


 */