
//세 과목의 시험점수(int)가 입력될 때, 평균 점수(double)를 구하여라. 단, 유효자리수는 신경쓰지 않는다.
package D2.Practice;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner Enter3Num = new Scanner(System.in); //Creat a Scanner object
        System.out.println("Enter 3 integer: ");
        int N1 = Enter3Num.nextInt();
        int N2 = Enter3Num.nextInt();
        int N3 = Enter3Num.nextInt();
        Enter3Num.close();

        double DoubleN1 = (double) N1;
        double DoubleN2 = (double) N2;
        double DoubleN3 = (double) N3;

        double Avg1 =  ((double)N1 + N2 + N3)/3;
        double Avg2  = (DoubleN1 + DoubleN2 + DoubleN3)/3;
        System.out.println(Avg1);
        System.out.println(Avg2);

        // Use System.out.printf
        System.out.printf("Average is: %.2f\n", Avg1);
        System.out.printf("Average is: %.2f\n", Avg2);

        // Use code: String formatA = String.format(".....", A)
        String formatAvg = String.format("Average is: %.2f", Avg1);
        System.out.println(formatAvg);



}
    }
