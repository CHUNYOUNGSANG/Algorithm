package baekjoon.java.conditional_statement;

import java.util.Scanner;

public class No2480_ThreeDice { // 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int num1 = sc.nextInt();    // 첫 번째 주사위 숫자
        int num2 = sc.nextInt();    // 두 번째 주사위 숫자
        int num3 = sc.nextInt();    // 세 번째 주사위 숫자

        if (num1 == num2 && num2 == num3 && num1 ==num3) {  // 세 개의 주사위 숫자가 모두 같은 경우
            System.out.println(10000 + num1 * 1000);
        } else if (num1 == num2 && num1 != num3) {  // 두 개의 주사위 숫자가 같고, 나머지 한 개의 숫자가 다른 경우
            System.out.println(1000 + num1 * 100);
        } else if (num2 == num3 && num2 != num1) {  // 두 개의 주사위 숫자가 같고, 나머지 한 개의 숫자가 다른 경우
            System.out.println(1000 + num2 * 100);
        } else if (num3 == num1 && num3 != num2) {  // 두 개의 주사위 숫자가 같고, 나머지 한 개의 숫자가 다른 경우
            System.out.println(1000 + num3 * 100);
        } else {
            System.out.println(Math.max(num1, Math.max(num2, num3)) *100);  // 모든 주사위 숫자가 다른 경우 (가장 큰 숫자)
        }
        sc.close(); // 시스템 자원 누수를 방지하기 위해 Scanner 개체를 닫는다.
    }
}

/*
 문제 : 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
      같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
      같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
      모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
      예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
      또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
      3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
      3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

 입력 : 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

 출력 : 첫째 줄에 게임의 상금을 출력 한다.

 예제 입력 1 : 3 3 6
 예제 출력 1 ; 1300

 예제 입력 2 : 2 2 2
 예제 출력 2 : 12000

 예제 입력 3 : 6 2 5
 예제 출력 3 : 600
 */
