package D2;

import java.sql.Date;

public class D21Rithmetics {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }

    public int subtract(int v1, int v2) {
        return v1 - v2;
    }

    public long multiply(int v1, int v2) {
        return v1 + v2;
    }
    
    public float divide(int v1, int v2) {
        return (float)v1 / v2;
    }

    public static void main(String[] args) {
        //일만 사칙산 + - * / 와 %
        int plus = 10 +10;
        int minus = 10 - 5;
        int multiply = 10 * 10;
        int divide = 10/5;
        int modulo = 15%10; // phần dư: result = 5
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);
        //연산의 순서는 * / 먼저
        int result = 3+2+3;
        System.out.println(result);
        //괄호가 있으면 괄호 내부 먼저
        result = (3+2)*3; //15
        System.out.println(result);
        //%는 *,/ 와 같은 순서로 진행
        result = (10+5%3)/3+2*3; //10
        System.out.println(result);
        //정수 나누기 정수의 결과는 정수
        System.out.println(21/10);
        int notDividedInt = 21/10;
        System.out.println(notDividedInt); //2
        //
        double notDividedDouble = 21.0/10;
        System.out.println(notDividedDouble);//2.0

        //int inResult = 10.1 +2; // 오류

        //형변환 - type casting
        int integer = (int)2.1; // 2
        System.out.println(integer);

        //t묵시적 형변환 (implicit)
        byte aByte = 1; // short ashort = (short) aByte;
        short aShort = aByte;
        int aInt = aShort;
        long aLong = aInt;
        float aFloat = aLong;
        double aDouble = aFloat;
        System.out.println("castDouble: " + aDouble);

        // 명시적 형변환 (explicit)
        double doubleVar = 10.24;
        int castDouble = (int) doubleVar; //hàm này là lấy phần số nguyên trước dấu chấm, KQ: 10
        System.out.println("castDouble: " + castDouble);
        // Làm tròn. Math.round();
        System.out.println("Rounding of 5.6 = " + Math.round(5.6f));

        //데이터 손실이 가능성이 가능한다.
        int dataLost = (int) 42967296L;
        System.out.println("dataLost: " + dataLost);

        // 정수끼리 나누어서 실수를 구하고 싶다면 nếu muốn lấy số thực trong phép chia số nguyên,
        // 먼저 숫자 중 하나를 실수로 바꿔주자. trước đó phải đổi sang loại số thực
        double doubleDivide = (double) 21 / 10;
        System.out.println(doubleDivide);  // 2.1
        // char의 형변환
        char aChar = 65; //A
        System.out.println(aChar + 10); //--> integer: 75
        System.out.println((char) (aChar +10)); // --> char 75 = K

        // 문자열 덧셈(?)이 아니라
        // String Concatenation
        String hello = "Hello, ";
        String world = "World!!!";
        String helloWorld = hello + world;
        System.out.println(helloWorld);
        helloWorld = "Hello," + " " + "World!!!";
        System.out.println(helloWorld);

        // 다른 자료형과 함께라면?
        int date = 21;
        System.out.println("Today is " + date + ".");

        D21Rithmetics arith = new D21Rithmetics(); 
        System.out.println("3 + 4 = " + arith.sum(3, 4));
        System.out.println("3 - 4 = " + arith.subtract(3, 4));
        System.out.println("3 * 4 = " + arith.multiply(3, 4));
        System.out.println("3 / 4 = " + arith.divide(3, 4));

         // 증감 연산자 Toán tử tăng
         int count = 0;
         // count = count + 1;
         count++;
         System.out.println(count);
         // count = count - 1;
         count--;
         System.out.println(count);
 
         count = 10;
         // 앞에 붙으면 먼저 올리고 값을 사용한다.
         ++count; //count = 11
         // 뒤에 붙으면 사용하고 값을 올린다.
         count++; //12
         System.out.println(++count); // count = 13
         System.out.println(count++); // print : 13, count  = 14
         System.out.println(count); //14
 
         // '=' 활용하기
         int addTo = 1;
         // addTo = addTo + 10;
         addTo += 10; //addTo = 11
         System.out.println(addTo);  // 11
         addTo -= 10; //addTo = 1
         addTo *= 10; // addto = 10
         addTo /= 10; // addto = 1
         addTo %= 10; // addTo = 1 (phần du của 1/10)
         System.out.println(addTo); // 1
 
         int base = 2;
         // base = base * base;
         base *= base; // base = 4
         System.out.println(base);


    }
}
