package baekjoon.java.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No11718_PrintAsItIs {  // 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) throws Exception {   // 예외 처리를 위한 throws 선언

        // 표준 입력을 BufferedReader로 읽어들임
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str; // 입력된 문자열을 저장할 변수 선언

        // 무한 루프: 표준 입력에서 문자열을 읽어들여 출력
    while((str = br.readLine()) != null) {  // 입력된 문자열이 null이 아닌 동안 반복
        System.out.println(str);    // 입력된 문자열을 출력
    }
    br.close(); // BufferedReader를 닫음
    }
}

/*
 문제 : 입력 받은 대로 출력하는 프로그램을 작성하시오.

 입력 : 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
      각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

 출력 : 입력받은 그대로 출력한다.

 예제 입력 1 = Hello
             Baekjoon
             Online Judge
 예제 출력 1 = Hello
             Baekjoon
             Online Judge
 */