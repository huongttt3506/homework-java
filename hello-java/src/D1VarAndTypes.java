public class D1VarAndTypes {
    public static void main(String[] args) {
        // 변수를 선언하고
        int a = 2;
        int b = 3;
        // 사용한다.
        System.out.println(a + b);
        System.out.println(a);
        System.out.println(b);

        String line = "Hello Variables!";
        System.out.println(line);

        // 어떤 데이터를 담을지를 잘 정해주어야 한다.
        int thousand = 1000;
        // 다르면 오류가 발생
        // int ten = "10";

        // 변수를 먼저 만들고
        int date;
        // System.out.println(date); // 오류
        // 값은 나중에 할당할 수 있다.
        date = 10;
        // 단, 할당 전에 사용은 불가

        // 한줄에 두개 이상의 변수를 만들 수 있다.
        int month = 6, day = 20;
        System.out.println(month);
        System.out.println(day);
//        문법적 변수 이름 규칙
//        숫자로 시작할 수 없다.
        /* 오류
        int 1st = 10;
        int 2nd = 20;
        */
        // '_' 또는 '$' 외의 특수문자를 사용외의 특수문자를 사용할 수 없다.
        int max_int = 10;
        int min$int = 20;
        /* 오류
        int sum# = 30;
        */
        // Java가 내부적으로 사용하는 단어는 사용할 수 없다.
        /* 오류
            int int = 10;
            int class = 20;
            int void = 100;
           */
        //Naming Convention
        int lunchPrice = 100;
        int dinnerPrice = 200;

        int maxInt = 2147483647; //2^31
        int minInt = -2147483647; //-2^31
       //정수 자료형
       int integer = 10;
       long bigInterger = 1000000000;
       //잘 안씀
        short smallInterger = 10000;
        byte reallySmall = 127;
        // long에 데이터를 넣으때, L을 붙여줘야 큰 숫자가 된다.
        long longInt = 100000000000000L;



    }
    }