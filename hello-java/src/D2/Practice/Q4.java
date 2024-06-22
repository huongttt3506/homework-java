package D2.Practice;

import java.util.Scanner;

// 두 정수 A와 B가 입력될 때, A의 세제곱이 B의 제곱보다 크면 true, 아니면 false를 출력하여라.
// Enter 2 integer A and B, A^3 > B^2 ? true : false
public class Q4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter 2 number: ");
        int a = scanner.nextInt();
        int b  = scanner.nextInt();
        System.out.println(a*a*a > b*b);
        System.out.println(Math.pow(a,3) > Math.pow(b,2));

    }
}
