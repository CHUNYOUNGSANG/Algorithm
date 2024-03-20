package 백준.자바.조건문.시험_성적_9498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 사용자를 입력을 받기 위해 Scanner 객체를 생성
        int a = sc.nextInt();   // 사용자로부터 정수를 입력받아 변수 a에 저장

        if (a >= 90 && a <= 100) {  // 만약 입력받은 점수가 90 이상 100 이하라면
            System.out.println("A");    // "A"를 출력
        } else if (a >= 80 && a <= 89) {    // 입력받은 점수가 80 이상 89 이하라면
            System.out.println("B");    // "B"를 출력
        } else if (a >= 70 && a <= 79) {    // 입력받은 점수가 70 이상 79 이하라면
            System.out.println("C");    // "C"를 출력
        } else if (a >= 60 && a <= 69) {    // 입력받은 점수가 60 이상 69 이하라면
            System.out.println("D");    // "D"를 출력
        } else {     // 그 외, 입력받은 점수가 0부터 59까지의 범위에 속하는 경우
            System.out.println("F");    // "F"를 출력
        }
        sc.close(); // 시스템 자원 누수를 방지하기 위해 Scanner 개체를 닫는다.
    }
}

/*
 문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

 입력 : 첫째 줄에 시험 점수가 주어진다. 시험점수는 0보다 크거나 같고, 100보다는 작거나 같은 정수이다.

 출력 : 시험 성적을 출력한다

 예제 입력 1 : 100
 예제 출력 1 : A
 */