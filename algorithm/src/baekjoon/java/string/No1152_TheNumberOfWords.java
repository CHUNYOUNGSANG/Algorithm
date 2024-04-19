package baekjoon.java.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No1152_TheNumberOfWords {  // 백준에 제출할 때는 Main으로 변경 해야한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자로부터 입력을 받기 위해 Scanner 객체를 생성한다.
        String a = sc.nextLine();   // 사용자로부터 한 줄의 문자열을 입력받는다.

        StringTokenizer st = new StringTokenizer(a, " ");   // 입력받은 문자열을 공백을 기준으로 나누는 StringTokenizer 객체를 생성한다.
        int count = 0;

        System.out.println(st.countTokens());   // StringTokenizer 객체의 countTokens() 메서드를 사용하여 토큰의 개수를 출력한다.

        sc.close(); // 입력이 끝났으므로 Scanner 객체를 닫는다.
    }

}

/*
 문제 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
      단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

 입력 : 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
      단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

 출력 : 첫째 줄에 단어의 개수를 출력한다.

 예제 입력 1 = The Curious Case of Benjamin Button
 예제 출력 1 = 6

 예제 입력 2 = The first character is a blank
 예제 출력 2 = 6

 예제 입력 3 = The last character is a blank
 예제 출력 3 = 6
 */