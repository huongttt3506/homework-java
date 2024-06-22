package D2.Practice;
//한줄에 정수가 공백문자로 구분되어 5개가 입력된다. 첫번째 입력된 숫자에,
// 이후에 순서대로 입력된 숫자들을 순서데로 더하고, 빼고, 곱하고, 나눈 몫을 출력하여라.
//입력: 2 3 5 2 5 출력: 0

import java.util.Scanner;

public class Qa {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        scanner.close();
        System.out.println((number1 + number2 - number3) * number4 / number5);
    }
}
