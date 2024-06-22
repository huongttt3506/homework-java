package D2.Practice;
// 어떤 야구단의 승, 무승부, 패가 입력된다. 이 야구단의 승률 (승 / (승 + 패))를,
// 소숫점 세번째 자리 까지, 아래의 예시와 같이 출력하여라.
// 86
//2
//56 --> 86승 2무 56패 승률: 0.606

import java.util.Scanner;

public class Qc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("야구단의 승 경기 입력하세요: ");
        int win = scanner.nextInt();
        System.out.print("야구단의 무승부 경기 입력하세요: ");
        int draw = scanner.nextInt();
        System.out.print("야구단의 패 경기 입력하세요: ");
        int lost = scanner.nextInt();
        scanner.close();
        System.out.printf("%d 승 %d 무 %d 패 승률: %.3f\n ", win, draw, lost, (float) win/(win + lost));

    }
}
