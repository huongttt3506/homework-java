package D2.Practice;

import java.util.Scanner;

// 현재 시간은 오전 7시이다. 자연수 하나를 입력받아,
// 그 값만큼 시간이 흐른다면 시침이 몇시 위에 있을지를 출력하시오. 단, 12시는 0으로 출력한다.
// 입력 7 -> 2
// 12 = 0;
public class Qb {
    public static void main (String[] args) {
        int time = 7;
        System.out.print("enter the number of hours passed: ");
        Scanner scanner = new Scanner(System.in);
        int timepassed = scanner.nextInt();
        scanner.close();
        System.out.println ((7 + timepassed)%12 == 0? 0 : (7 + timepassed)%12);

    }

}
