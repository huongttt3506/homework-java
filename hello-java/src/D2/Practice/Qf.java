package D2.Practice;

import java.util.Scanner;

// 한개의 정수 A를 입력받아, A^2, A^4, A^8의 1의 자리를 순서대로 한줄씩 출력하시오.
// mod (A^2/10, A^4/10, A^8 /10)
public class Qf {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Vòng lặp while (true) {} // kết thúc vòng lặp (if a == 0) {break; }
        while (true) {
            System.out.print("enter a integer: ");
            int a = scanner.nextInt();
            if (a==0){
                break;
            }
            System.out.println((int) Math.pow(a, 2) % 10);
            System.out.println((int) Math.pow(a, 4) % 10);
            System.out.println((int) Math.pow(a, 8) % 10);
        }
        scanner.close();
    }
}
