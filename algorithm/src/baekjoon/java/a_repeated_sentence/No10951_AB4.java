package baekjoon.java.a_repeated_sentence;


import java.util.Scanner;

public class No10951_AB4 {  // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력 받기 위해 Scanner 객체를 생성
        while (sc.hasNext()) {  // 입력이 더 이상 없을 때까지 계속 반복 hasNext()는 입력이 있으면 true를 반환하고, 없으면 false를 반환
            int a = sc.nextInt();   // 정수를 입력받아 변수 a에 저장
            int b = sc.nextInt();   // 정수를 입력받아 면수 b에 저장
            System.out.println(a + b);  // 변수 a와 b의 합을 출력
        }
        sc.close(); // Scanner 객체를 닫아 메모리 누수를 방지
    }
}


/*
 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

 출력 : 각 테스트 케이스마다 A+B를 출력한다.

 예제 입력 1 = 1 1
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