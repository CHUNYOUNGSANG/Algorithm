package baekjoon.java.one_dimensional_array_stage;

import java.util.Scanner;

public class No10813_ChangeTheBall {    // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        int N = sc.nextInt();   // 입력받을 N, 바구니의 개수
        int[] arr = new int[N]; // 바구니를 나타내는 배열
        int M = sc.nextInt();   // 입력받을 M , 교환 횟수
        int temp;   // 교환을 위한 임시 변수

        for (int i = 0; i < arr.length; i++) {  // 배열 초기화, 각 바구니에는 1부터 N까지의 번호가 할당됨
            arr[i] = i + 1;
        }

            for (int j = 0; j < M; j++) {   // M번의 교환을 수행하는 반복문
                int I = sc.nextInt();   // 첫 번째 바구니의 인덱스
                int J = sc.nextInt();   // 두 번째 바구니의 인덱스

                temp = arr[I - 1];  // 첫 번째 바구니의 값을 임시 변수에 저장
                arr[I - 1] = arr[J - 1];    // 두 번째 바구니의 값을 첫 번째 바구니에 대입
                arr[J - 1] = temp;  // 임시 변수에 저장된 값(첫 번째 바구니의 기존 값)을 두 번째 바구니에 대입
        }
        for (int k = 0; k < arr.length; k++) {  // 모든 교환이 완료된 후, 바구니 배열의 내용을 출력
            System.out.print(arr[k] + " ");
        }
        sc.close(); // Scanner 객체 닫기
    }

}

/*
 문제 : 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
      바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
      도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
      공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
      둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다.
      각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
      도현이는 입력으로 주어진 순서대로 공을 교환한다.

 출력 : 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

 예제 입력 1 = 5 4
             1 2
             3 4
             1 4
             2 2
 예제 출력 1 = 3 1 4 2 5
 */