package D1;//"오전" 또는 "오후"를 입력받은 뒤, 0 ~ 11 사이의 정수를 입력받아 "오전 x시" 의 형식으로 출력하는 코드를 작성하시오

import java.util.Scanner;

public class HomeWord_Qe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // input "오전" "오후" String
        System.out.print("오전이나 오후를 입력하세요: ");
        String input = scanner.nextLine();
       // input the time
        System.out.print("0 ~ 11 사이의 정수를 입력하세요: ");
       // print
        int time = scanner.nextInt();
        System.out.println(input + " " + time + " 시");
        System.out.println((String.format("%s %d시", input, time)));

    }
}
