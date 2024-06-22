package D2.Practice;

import java.util.Scanner;

//ASCII 코드로 'A'는 65이다. 1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter 1 number from 1 to 26: ");
        int input = scanner.nextInt();
        // 65 = A, 66 = B --> (char) (64 + input)
        System.out.println((char) (64 +input));

    }
}
