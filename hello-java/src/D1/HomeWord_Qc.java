package D1;//사용자에게 2개의 정수를 입력받고, 입력받은 두 수의 곱을 출력하는 코드를 작성하시오.

import java.util.Scanner;

public class HomeWord_Qc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers please: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.print("Multiple of 2 numbers " + num1 + " and " + num2 + " equal: ");
        System.out.println(num1*num2);

    }
}
