package baekjoon.java.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157_StudyingWords  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader를 사용하여 입력을 받는다.

        int[] arr = new int[26];    // 알파벳의 등장 횟수의 저장할 배열을 생성한다.
        String a = br.readLine();   // 사용자로부터 한 줄을 입력받아 변수 a에 저장한다.
        br.close(); // BufferedReader를 닫는다.

        for (int i = 0; i < a.length(); i++) {  // 입력받은 문자열을 순회하면서 각 알파벳의 등장 횟수를 배열에 저장한다.
            if ('a' <= a.charAt(i) && a.charAt(i) <= 'z') { // 소문자일 경우
                arr[a.charAt(i) - 97]++;
            } else {    // 대문자일 경우
                arr[a.charAt(i) - 65]++;
            }
        }

        int max = -1;   // 가장 많이 등장한 알파벳의 등장 횟수를 저장하는 변수
        char ch = '?';  // 가장 많이 등장한 알파벳을 저장하는 변수

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) { // 현재 알파벳의 등장 횟수가 최대 등장 횟수보다 많은 경우
                max = arr[i];   // 최대 등장 횟수를 현재 알파벳의 등장 횟수로 업데이트
                ch = (char) (i + 65);   // 가장 많이 등장한 알바펫을 업테이트
            } else if (arr[i] == max) { // 등장 횟수와 같은 경우에는 '?'로 설정한다.
                ch = '?';
            }
        }

        System.out.print(ch);   // 결과를 출력한다.
    }
}

/*
 문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

 입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

 출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

 예제 입력 1 = Mississipi
 예제 출력 1 = ?

 예제 입력 2 = zZa
 예제 출력 2 = Z

 예제 입력 3 = z
 예제 출력 3 = Z

 예제 입력 4 = baaa
 예제 출력 4 = A
 */