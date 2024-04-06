package baekjoon.java.one_dimensional_array_stage;

import java.util.Scanner;

public class No2562_MaximumValue {   // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성

        int arr[] = new int[9]; // 크기가 9인 정수형 배열을 선언
        int max = 0;    // 최댓값을 저장할 변수를 초기화
        int count = 0;  // 최댓값이 위치한 인덱스를 저장할 변수를 초기화

        for (int i = 0; i < arr.length; i++) {   // 9번 반복하면서 입력을 받고, 최댓값과 그 위치를 찾음
            arr[i] = sc.nextInt();  // 사용자로부터 정수를 입력받음

            if (arr[i] > max) { // 현재 입력된 값이 최댓값보다 크다면
                max = arr[i];   // 최댓값을 업데이트
                count = i + 1;  // 최댓값의 위치(인덱스)를 업데이트
            }
        }
        System.out.println(max);    // 최댓값 출력
        System.out.println(count);  // 최댓값의 위치(인덱스) 출력
     }
}

/*
 문제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
      예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

 입력 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

 출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

 예제 입력 1 = 3
             29
             38
             12
             57
             74
             40
             85
             61
 예제 출력 1 = 85
             8
 */