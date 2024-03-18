package 백준.자바.조건문.두_수_비교하기_1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            boolean a = A == B; {
                System.out.println("==");
            }
        }
    }
}
