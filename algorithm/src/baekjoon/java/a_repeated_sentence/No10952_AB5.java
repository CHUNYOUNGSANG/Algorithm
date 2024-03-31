package baekjoon.java.a_repeated_sentence;

import java.io.*;

public class No10952_AB5 {  // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력을 위한 BufferedReader 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위한 BufferedWriter 객체 생성

        while(true) {   // 무한 루프로 입력을 반복
            String[] input = br.readLine().split(" ");  // 공백을 기준으로 입력된 문자열을 분리하여 배열에 저장
            int A = Integer.parseInt(input[0]); // 첫 번째 숫자를 정수로 변환하여 저장
            int B = Integer.parseInt(input[1]); // 두 번째 숫자를 정수로 변환하여 저장

            if (A == 0 && B ==0) {  // 입력된 숫자가 모두 0이면 무한 루프를 종료
                break;
            }
            bw.write((A + B) + "\n");   // A와 B의 합을 출력
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

/*
 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
      입력의 마지막에는 0 두 개가 들어온다.

 출력 : 각 테스트 케이스마다 A+B를 출력한다.

 예제 입력 1 = 1 1
             2 3
             3 4
             9 8
             5 2
             0 0
 예제 출력 1 = 2
             5
             7
             17
             7
 */