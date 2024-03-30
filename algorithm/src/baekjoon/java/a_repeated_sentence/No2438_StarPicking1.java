package baekjoon.java.a_repeated_sentence;

import java.io.*;

public class No2438_StarPicking1 {  // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력을 위한 BufferedReader 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위한 BufferedWriter 객체 생성

        int N = Integer.parseInt(br.readLine());    // 사용자로부터 숫자 N을 입력받음.

        for (int i = 1; i <= N; i++) {  // i는 1부터 N까지 반복
            for (int j = 1; j <= i; j++) {  // j는 1부터 i까지 반복
                bw.write("*");  // *를 출력
            }
            bw.newLine();   // i번째 줄에 별표 출력을 모두 마친 후, 새로운 줄로 별표를 출력
        }
        br.close(); // BufferedReader를 닫음
        bw.flush(); // BufferedWriter의 버퍼를 비워서 출력
        bw.close(); // BufferedWriter를 닫음
    }
}

/*
 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

 예제 입력 1 = 5
 예제 출력 1 = *
             **
             ***
             ****
             *****
 */