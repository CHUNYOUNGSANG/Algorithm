package baekjoon.java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2908_AConstant {
    public static void main(String[] args) throws IOException {
        // BufferedReader는 문자 입력 스트림으로부터 텍스트를 읽기 위해 사용된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer는 문자열을 토큰으로 분할하기 위해 사용된다.
        // 공백으로 구분된 입력을 읽기 위해 사용한다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 첫 번째 토큰을 읽고 ,StringBuilder를 사용하여 뒤집고 , 그 후에 정수로 변환합니다.
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        // 두 번째 토큰을 읽고, StringBuilder를 사용하여 뒤집고, 그 후에 정수로 변환합니다.
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.print(A > B ? A : B);    // A와 B 중 더 큰 값을 출력합니다.

        br.close(); // BufferedReader를 닫아 리소스를 해제한다.

    }
}

/*
 문제 : 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
      이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다.
      그 다음에 크기가 큰 수를 말해보라고 했다.
      상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
      따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다. 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

 출력 : 첫째 줄에 상수의 대답을 출력한다.

 예제 입력 1 = 734 893
 예제 출력 1 = 437

 예제 입력 2 = 221 231
 예제 출력 2 = 132

 예제 입력 3 = 839 237
 예제 출력 3 = 938
 */