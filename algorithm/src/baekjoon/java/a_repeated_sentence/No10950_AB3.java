package baekjoon.java.a_repeated_sentence;

import java.util.Scanner;

public class No10950_AB3 {  // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int T = sc.nextInt();   // 테스트 케이스의 개수를 입력 받음

        for (int i = 1; i <= T; i++) {   // 테스트 케이스의 개수만큼 반복
            int A = sc.nextInt();   // 정수 A를 입력 받음
            int B = sc.nextInt();   // 정수 B를 입력 받음

            System.out.println(A + B);  // A와 B를 더한 값을 출력
        }
        sc.close(); // Scanner 객체를 닫아 메모리 누수를 방지
    }
}

/*
 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

 출력 : 각 테스트 케이스마다 A+B를 출력한다.

 예제 입력 1 = 5
             1 1
             2 3
             3 4
             9 8
             5 2
 예제 출력 1 = 2
             5
             7
             17
             7
 */