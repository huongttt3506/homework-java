//사용자에게 소숫점으로 표현된 실수를 입력받고, 소숫점 4번째 자리까지 출력하시오.

import java.util.Scanner;

public class HomeWord_Qd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double number  = scanner.nextDouble();
        System.out.printf("%.4f\n", number);

        String template = "%.4f";
        System.out.println(String.format(template, number));


}
}
