package baekjoon.java.conditional_statement;

import java.util.Scanner;

public class No14681_Quaternary_picking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성

        int x, y;   // 정수형 변수 x와 y를 선언
        x = sc.nextInt();   // 사용자로부터 정수를 입력받아 변수 x에 저장
        y = sc.nextInt();   // 사용자로부터 정수를 입력받아 변수 y에 저장

        if (x > 0 && y > 0) {   // 만약 x, y가 양수라면
            System.out.println("1");    // "1"을 출력 (제 1사분면)
        } else if (x < 0 && y > 0) {    // x가 음수, y가 양수라면
            System.out.println("2");    // "2"를 출력 (제 2사분면)
        } else if (x < 0 && y < 0) {    // x, y가 모두 음수라면
            System.out.println("3");    // "3"을 출력 (제 3사분면)
        } else {    // 그 외의 경우, x가 양수이거나 음수, y가 0이거나 음수인 경우
            System.out.println("4");    // "4"를 출력 (제 4사분면)
        }
        sc.close(); // 시스템 자원 누수를 방지하기 위해 Scanner 개체를 닫는다.

    }
}

/*
 문제 : 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
      예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
      점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
      점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

 입력 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)

 출력 : 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

 예제입력 1 : 12
            5
 예제출력 1 : 1

 예제입력 2 : 9
           -13
 예제출력 2 : 4

 */

