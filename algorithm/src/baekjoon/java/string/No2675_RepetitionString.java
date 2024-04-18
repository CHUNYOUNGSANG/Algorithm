package baekjoon.java.string;

import java.util.Scanner;

public class No2675_RepetitionString {  // 백준에 제출할 때는 Main으로 변경 해야한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자로부터 입력을 받기 위해 Scanner 객체를 생성한다.

        int T = sc.nextInt();   // 테스트 케이스 T를 입력받는다.
        for(int i = 0; i < T; i++) {    // 테스트 케이스의 개수만큼 반복한다.
            int R = sc.nextInt();   // 문자열 S를 반복할 횟수 R을 입력받는다.
            String S = sc.next();   // 반복될 문자열 S를 입력받는다.

            for(int j = 0; j < S.length(); j++) {   // 문자열 S의 각 문자에 대해 반복한다.
                for(int k = 0; k < R; k++) {    // 해당 문자를 R번 반복해서 출력한다.
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();   // 각 테스트 케이스마다 한 줄씩 출력한다.
        }
        sc.close(); // 입력이 끝났으므로 Scanner 객체를 닫는다.
    }
}

/*
 문제 : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
      즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
      QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

 입력 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8),
      문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

 출력 : 각 테스트 케이스에 대해 P를 출력한다.

 예제 입력 1 = 2
            3 ABC
            5 /HTP
 예제 출력 1 = AAABBBCCC
            /////HHHHHTTTTTPPPPP
 */