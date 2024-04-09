package baekjoon.java.one_dimensional_array_stage;

import java.util.HashSet;
import java.util.Scanner;

public class No3052_Remainder { // 백준 제출할 때는 Main 으로 변경해야 함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 객체를 생성
        HashSet <Integer> set = new HashSet<> (10); // HashSet 객체를 생성해서 중복을 허용하지 않는 집합을 만듬.

        for (int i = 0; i < 10; i++) {  // 10번 반복하여 사용자로부터 정수를 입력받고,
            set.add(sc.nextInt() % 42); // 42로 나눈 나머지 값을 HashSet에 저장
        }
        sc.close();  // Scanner를 닫아줌 (자원 해제)
        System.out.println(set.size());    // HashSet에 저장된 값을 출력
    }
}

/*
 주요 포인트 : 1. 'Scanner'를 사용하여 사용자로부터 입력을 받음.
            2. 'HashSet'을 사용하여 중복된 값은 저장되지 않도록 함.
            3. 입력받은 값은 42로 나눈 나머지는 'HashSet'에 저장됨.
            4. 'HashSet'에 저장된 값들을 출력함으로써 중복이 제거된 나머지 값들을 확인할 수 있음.
 */

/*
 문제 : 두 자연수 A와 B가 있을 때, A % B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
      수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

 출력 : 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

 예제 입력 1 = 1
             2
             3
             4
             5
             6
             7
             8
             9
             10
 예제 출력 1 = 10
 각 수를 42로 나눈 나머지는 1, 2, 3, 4, 5, 6, 7, 8, 9, 10이다.

 예제 입력 2 = 42
             84
             252
             420
             840
             126
             42
             84
             420
             126
 예제 출력 2 = 1
 모든 수를 42로 나눈 나머지는 0이다.

 예제 입력 3 = 39
             40
             41
             42
             43
             44
             82
             83
             84
             85
 예제 출력 3 = 6
 각 수를 42로 나눈 나머지는 39, 40, 41, 0, 1, 2, 이다. 서로 다른 값은 6개가 있다.
 */