package D2.Practice;

import java.util.Scanner;

// 세개의 양의 정수 A, B, C를 입력받아서, A가 B와 C의 공배수인지를 true 또는 false로 출력하여라.
public class Qe {
    public static void main  (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 positive integer: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        System.out.println(int1%int2 ==0 && int1%int3 == 0? "True" : "False");

    }
}
