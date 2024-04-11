package baekjoon.java.one_dimensional_array_stage;

import java.util.Scanner;

public class No10811_TurningTheBasketOver { // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체를 생성
        int N = sc.nextInt();   // 바구니 개수
        int M = sc.nextInt();   // 바구니의 순서를 변경하는 회수
        int[] baskets = new int[N]; // 바구니를 나타내는 배열

        // 초기 바구니 번호 설정
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 바구니 번호는 1부터 시작하므로 i + 1로 설정
        }

        // 바구니 순서를 변경하는 과정
        for (int k = 0; k < M; k++) { // 중첩 반복문에서 사용할 변수 이름 변경하여 변수 충돌 회피
            int start = sc.nextInt() - 1; // 시작 바구니, 0부터 시작하도록 설정
            int end = sc.nextInt() - 1; // 끝 바구니, 0부터 시작하도록 설정

            // 바구니 순서 역순으로 변경
            for (int j = 0; j <= (end - start) / 2; j++) {
                int temp = baskets[start + j];  // 시작 바구니부터 끝 바구니까지 순서를 역순으로 변경
                baskets[start + j] = baskets[end - j];
                baskets[end - j] = temp;
            }
        }

        // 최종 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " "); // 바구니의 순서를 공백으로 구분하여 출력
        }
        sc.close(); //Scanner 닫기
    }
}

/*
 문제 : 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
      바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
      도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고,
      그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
      바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음,
      바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
      둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고,
      왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
      도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

 출력 : 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.

 예제 입력 1 = 5 4
             1 2
             3 4
             1 4
             2 2
 예제 출력 1 = 3 4 1 2 5
 */
