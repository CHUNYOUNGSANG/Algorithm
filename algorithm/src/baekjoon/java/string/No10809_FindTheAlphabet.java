package baekjoon.java.string;

import java.util.Scanner;

public class No10809_FindTheAlphabet {  // 제출할 때는 Main 으로 변경해야 한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        String S = sc.nextLine();   // 사용자로 부터 한 줄의 문자열을 입력 받는다.
        int[] alpha = new int[26];  // 알파벳의 인덱스를 저장할 배열을 생성한다.

        for (int i = 0; i < 26; i++) {  // 배열 초기화 : 각 알파벳의 인덱스를 -1로 설정
            alpha[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {  // 문자열을 순회하며 각 알파벳이 처음 등장하는 위치를 저장한다.
            int index = S.charAt(i) - 97;   // 현재 문자의 ASCII 코드에서 "97 = 'a'"의 ASCII 코드를 빼서 알파벳 배열의 인덱스를 구한다.
            if(alpha[index] == -1) {    // 해당 알파벳이 처음 등장한 경우에만 인덱스를 저장한다.
                alpha[index] = i;
            }
        }
        for (int i = 0; i < 26; i++) {  // 결과 출력 : 각 알파벳이 처음 등장하는 위치를 공백으로 구분하여 출력한다.
            System.out.print(alpha[i] + " ");
        }
        sc.close(); // Scanner 객체를 닫는다.
    }
}

/*
 문제 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
      포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

 출력 : 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
      만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

 예제 입력 1 = baekjoon
 예제 출력 1 = 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */