package D1;

import java.util.Scanner;

// 사용자에게 두개의 단어를 입력받고, 두 단어를 붙여서 출력하는 코드를 작성하시오.
public class HomeWord_Qa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두개의 단어를 입력하세요: ");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        System.out.println(input1 + " " + input2);
        System.out.println(String.format("%s %s", input1, input2));


    }
}
