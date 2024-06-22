package D1;

import java.util.Scanner;

public class D1AplusB {
    public static void main(String[] args) {
        // 사용자한테 A를 입력받고, B를 입력받으면
        // A + B를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.println("A를 입력하세요: ");
        int inputA = scanner.nextInt();
        System.out.println("B를 입력하세요: ");
        int inputB = scanner.nextInt();
        System.out.println("A + B = ");
        System.out.println(inputA+inputB);



    }
}
