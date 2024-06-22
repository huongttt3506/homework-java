package D2.Practice;
// 두 수 A와 B가 입력된다. A를 B로 나눈 몫과 나머지를,
//A = 몫 * B + 나머지

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수 A와 B가 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int intAB = a/b;
        int modAB = a%b;
        System.out.println(a + " = " +intAB + " * " + b + " + " + modAB);

    }
}
