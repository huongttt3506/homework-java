import java.util.Scanner;

public class Practice0620_Q2 {
    public static void main(String[] args) {
        //  Q2: 사용자에게 정수 두개를 입력받고, 입력된 순서의 반대로 출력하는 코드를 작성하시오.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int Number1st = scanner.nextInt();
        System.out.print("Please enter the second integer: ");
        int Number2nd = scanner.nextInt();
        System.out.println("Output in reverse order of input:");
        System.out.println(Number2nd);
        System.out.println(Number1st);
    }
}
