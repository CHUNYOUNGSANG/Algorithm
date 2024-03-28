package baekjoon.java.a_repeated_sentence;

import java.util.Scanner;

public class No25304_Receipt {  // 백준 제출할 때는 Main 으로 변경해야 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int X = sc.nextInt();   // 지불해야 할 금액 X를 입력 받음
        int N = sc.nextInt();    // 물품의 개수 N을 입력 받음
        int total = 0;  // 총 금액을 저장할 변수 초기화

        for (int i =0; i < N; i++) {    // 물품의 개수만큼 반복
            int a = sc.nextInt();   // 각 물품의 가격 입력 받음
            int b = sc.nextInt();   // 각 물품의 수량 입력 받음

            total += a * b; // 각 물품의 가격과 수량을 곱하여 총 금액에 더함
        }
        if (total == X) {   // 총 금액과 지불해야 할 금액이 일치하는지 확인
            System.out.println("Yes");  // 일치하면 "Yes" 출력
        } else {
            System.out.println("No");   // 일치하지 않으면 "No" 출력
        }
        sc.close(); // Scanner 객체를 닫아 메모리 누수를 방지
    }
}

/*
 문제 : 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다.
      그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
      영수증에 적힌,
      - 구매한 각 물건의 가격과 개수
      - 구매한 물건들의 총 금액
      을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

 입력 : 첫째 줄에는 영수증에 적힌 총 금액X가 주어진다.
      둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수N이 주어진다.
      이후 N개의 줄에는 각 물건의 가격a와 개수b가 공백을 사이에 두고 주어진다.

 출력 : 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
      일치하지 않는다면 No를 출력한다.

 제한 : 1 ≤ X ≤ 1,000,000,000
      1 ≤ N ≤ 100
      1 ≤ a ≤ 1,000,000
      1 ≤ b ≤ 10

 예제 입력 1 = 260000
             4
             20000 5
             30000 2
             10000 6
             5000 8
 예제 출력 1 = Yes

 예제 입력 2 = 250000
             4
             20000 5
             30000 2
             10000 6
             5000 8
 예제 출력 2 = No
 */