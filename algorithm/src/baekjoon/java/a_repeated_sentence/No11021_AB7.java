package baekjoon.java.a_repeated_sentence;

import java.io.*;

public class No11021_AB7 {  // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader 객체 생성.(입력을 빠르게 처리하기 위한 클래스)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // BufferedWriter 객체 생성.(출력을 빠르게 처리하기 위한 클래스)

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수를 입력받음.

        for (int i = 1; i <= T; i++) {  // 테스트 케이스의 개수만큼 반복
            String[] input = br.readLine().split(" ");  // 입력된 한 줄을 공백을 기준으로 나누어서 문자열 배열로 저장
            int A = Integer.parseInt(input[0]); // 첫 번째 숫자를 정수로 변환하여 저장
            int B = Integer.parseInt(input[1]); // 두 번째 숫자를 정수로 변환하여 저장
            bw.write("Case #" + i + ": " + (A + B) + "\n"); // A와 B를 더한 결과를 출력 버퍼에 작성
        }
        br.close(); // BufferedReader를 닫음.
        bw.flush(); // BufferedWriter의 버퍼를 비워서 출력
        bw.close(); // BufferedWriter를 닫음.
    }
}

/*
 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

 출력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

 예제 입력 1 = 5
             1 1
             2 3
             3 4
             9 8
             5 2
 예제 출력 1 = Case #1: 2
             Case #2: 5
             Case #3: 7
             Case #4: 17
             Case #5: 7

 */