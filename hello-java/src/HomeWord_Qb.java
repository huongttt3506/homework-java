
//사용자에게 3개의 정수를 입력받고, 입력받은 순서의 반대로 출력하는 코드를 작성하시오.

import java.util.Scanner;

public class HomeWord_Qb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the three integer: ");
        int Int1st = scanner.nextInt();
        int Int2st = scanner.nextInt();
        int Int3st = scanner.nextInt();
        System.out.println("Output in reverse order of input:");
        System.out.println(Int3st);
        System.out.println(Int2st);
        System.out.println(Int1st);

    }
}
