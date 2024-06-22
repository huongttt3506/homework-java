package D2;

public class D22Comparison {
    public static void main(String[] args) {
         // 비교 연산자
        // 두개의 값을 비교해서 참 / 거짓을 만드는 연산자
        int small1 = 10;
        int small2 = 10;
        int big = 21;
        // true
        System.out.println(small1 == small2);

        // false
        System.out.println(small1 == big);

        // 같지 않다?  false "!=" 다른지? có khác nhau không? , khác nhau thì true, giống nhau thì false
        System.out.println(small1 != small2);

        // true
        System.out.println(big != small1);

        // 초과 lớn hơn >
        System.out.println(big > small1);  // true
        System.out.println(small2 > small1);  // false

        // 미만 ít hơn <
        System.out.println(big < small1);  // false
        System.out.println(small2 < big);  // true
        // 이상 >= lớn hơn hoặc bằng
        System.out.println(big >= small1);    // true
        System.out.println(small1 >= small2); // true

        // 이하 nhỏ
        System.out.println(big <= small1);    // false
        System.out.println(small1 <= small2); // true

        int base = 12;
        int num = 3;

        // base가 num의 배수인가?
        System.out.println(base % num == 0); //true

        int[] scores = {10, 9, 8};
        // 점수의 평균이 8.5 보다 큰가?
        int sum = scores[0] + scores[1] + scores[2];
        double avg = (double) sum / 3;
        System.out.println(avg > 8.5); //true


        // 논리 연산자
        // 여러조건들을 비교할때 사용하는 연산자
        int temperature = 36;
        int age = 25;

        // 체온은 37도 이하면서 나이는 20살 이상인가?
        System.out.println(temperature <= 37); //true
        System.out.println(age >= 20); //true
        // AND 연산 (&&)
        System.out.println(temperature <= 37 && age >= 20); //true

        boolean notSick = temperature <= 37; //notSick = true
        boolean isOfAge = age >= 20; //is0Age = true
        // 둘다 true 이면 true
        // 하나라도 false 이면 false
        System.out.println(notSick && isOfAge); //true

        // OR 연산 (||)
        boolean isSunday = true;
        boolean isHoliday = true;
        boolean canRest = isSunday || isHoliday;
        System.out.println(canRest); //true

        // NOT 연산 (!) (phủ định)
        System.out.println(!canRest); //false

        // ! -> && -> ||
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(a && !b); //false
        System.out.println(!(b || c)); // true
        System.out.println(c || b && a || c); // false
        System.out.println(a && b || a && c); // false
    }
    
}