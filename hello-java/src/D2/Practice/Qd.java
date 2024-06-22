package D2.Practice;
// 두 정수 A와 B가 입력될 때, A가 B로 나누어 떨어지는지를 true 또는 false로 출력하여라.
// A%B == 0? true : false

import java.util.Scanner;

public class Qd {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter 2 number: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        scanner.close();
        System.out.println(numA%numB == 0 ? "true" : "false");
    }
}
