package baekjoon.java.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2941_CroatianAlphabet {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 문자열 입력 받음
        String str = br.readLine();

        // 입력된 문자열의 길이를 구함
        int len = str.length();

        // 크로아티아 알파벳의 개수를 세기 위한 변수 초기화
        int count = 0;

        // 문자열을 한 글자씩 순회하며 크로아티아 알파벳의 개수를 센다
        for (int i = 0; i < len; i++) {
            // 현재 위치의 문자를 가져온다
            char ch = str.charAt(i);

            // 만약 'c'라면
            if (ch == 'c' && i < len - 1) {
                // 그 다음 문자가 '=' 또는 '-'이면 크로아티아 알파벳의 일부이므로 2개의 문자로 취급한다
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++; // 다음 문자로 건너뛴다

                }
            }

            // 만약 'd'라면
            else if (ch == 'd' && i < len - 1) {
                // 그 다음 문자가 '-'이면 크로아티아 알파벳의 일부이므로 2개의 문자로 취급한다
                if (str.charAt(i + 1) == '-') {
                    i++; // 다음 문자로 건너뛴다
                }

                // 그 다음 문자가 'z'이고, 그 다다음 문자가 '='이면 'dz='로 크로아티아 알파벳을 이루므로 3개의 문자로 취급한다
                else if (str.charAt(i + 1) == 'z' && i < len - 2 && str.charAt(i + 2) == '=') {
                    i += 2; // 다음 문자로 건너뛴다

                }
            }

            // 만약 'l' 또는 'n'이라면, 그 다음 문자가 'j'이면 크로아티아 알파벳의 일부이므로 2개의 문자로 취급한다
            else if ((ch == 'l' || ch == 'n') && i < len - 1 && str.charAt(i + 1) == 'j') {
                i++; // 다음 문자로 건너뛴다

            }

            // 만약 's' 또는 'z'라면, 그 다음 문자가 '='이면 크로아티아 알파벳의 일부이므로 2개의 문자로 취급한다
            else if ((ch == 's' || ch == 'z') && i < len - 1 && str.charAt(i + 1) == '=') {
                i++; // 다음 문자로 건너뛴다

            }

            // 크로아티아 알파벳의 글자수를 셈
            count++;

        }

        // 총 크로아티아 알파벳의 개수 출력
        System.out.println(count);
        br.close(); // BufferedReader 객체를 닫음

    }
}


/*
 문제 : 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
      로아티아 알파벳	변경
      č	  c=
      ć	  c-
      dž   dz=
      đ	  d-
      lj   lj
      nj   nj
      š	  s=
      ž	  z=

      예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
      dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

 입력 : 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
      단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

 출력 : 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

 예제 입력 1 = ljes=njak
 예제 출력 1 = 6

 예제 입력 2 = ddz=z=
 예제 출력 2 = 3

 예제 입력 3 = nljj
 예제 출력 3 = 3

 예제 입력 4 = c=c=
 예제 출력 4 = 2

 예제 입력 5 = dz=ak
 예제 출력 5 = 3
 */
