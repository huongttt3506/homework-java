package D1;

import java.util.Scanner;
public class Practice0620_Q1 {
    public static void main(String[] args) {
        //Q1: 사용자에게 문자열 입력을 받고, 입력 받은 내용을 3번 출력하는 코드를 작성하시오: 입력: 안녕하세요
         Scanner scanner = new Scanner(System.in);
         System.out.print("Please enter: ");
         String input = scanner.nextLine();
         System.out.println(input);
         System.out.println(input);
         System.out.println(input);
    }
}
