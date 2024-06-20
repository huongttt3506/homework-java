import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class D1VarAndTypes {
    public static void main(String[] args) {
        // 변수를 선언하고 (khai baó biến)
        int a = 2;
        int b = 3;

        // 사용한다. (sử dụng biến)
        System.out.println(a + b);
        System.out.println(a);
        System.out.println(b);

        String line = "Hello Variables!";
        System.out.println(line);

        // 어떤 데이터를 담을지를 잘 정해주어야 한다. (phải quyết định cẩn thận loại dữ lệu đưa vào)
        int thousand = 1000;

        // 다르면 오류가 발생
        // int ten = "10";

        // 변수를 먼저 만들고
        int date;
        // System.out.println(date); // 오류

        // 값은 나중에 할당할 수 있다. phải khai báo biến trước, giá trị có thể phân bổ sau;
        date = 10;
        // 단, 할당 전에 사용은 불가 tuy nhiên, không thể sử dụng trước khi phân bổ;

        // 한줄에 두개 이상의 변수를 만들 수 있다./ 1 dòng có thể khai báo cùng lúc nhiều hơn 2 biến;
        int month = 6, day = 20;
        System.out.println(month);
        System.out.println(day);

//        문법적 변수 이름 규칙
//        숫자로 시작할 수 없다. tên biến ko được bắt đầu bằng số
        /* 오류
        int 1st = 10;
        int 2nd = 20;
        */
        // '_' 또는 '$' 외의 특수문자를 사용외의 특수문자를 사용할 수 없다.  ngoài '_' '$' thì ko dùng các kí tự đặc bệt khác.
        int max_int = 10;
        int min$int = 20;

        /* 오류
        int sum# = 30;
        */

        // Java가 내부적으로 사용하는 단어는 사용할 수 없다. không được sử dụng từ mà trong java sử dụng.
        /* 오류
            int int = 10;
            int class = 20;
            int void = 100;
           */
        //Naming Convention Quy tắt đặt tên
        int lunchPrice = 100;
        int dinnerPrice = 200;

        int maxInt = 2147483647; //2^31 Int (32bit)
        int minInt = -2147483647; //-2^31

        //정수 자료형 kiểu dữ liệu số nguyên
       int integer = 10; // 32bit
       long bigInterger = 1000000000; //số nguyên dài (64bit)

       //잘 안씀
        short smallInterger = 10000; //16bit
        byte reallySmall = 127; //8bit

        // long에 데이터를 넣으때, L을 붙여줘야 큰 숫자가 된다. phải thêm L vào sau số nguyên dài (long)
        long longInt = 100000000000000L;

        // 실수 자료형
        // long에 l처럼 float는 F를 붙여줘야 한다.
        float floatPoint = 2.71828F;

        //대부분의 상황에서 double을 쓴다. thuường thì sẽ dùng kiểu double
        double doublePoint = 3.1415926535911111111111111;

        //유효숫자가 많아지면 반을린 된다,(nếu qúa nhiều chữ số sẽ được làm tròn)
        System.out.println(doublePoint);

        //불린 (boolean) 자료형 giá trị logic
        boolean success = true;
        boolean fail = false;

        // 문자 (char) 자료형 kis tự unicode, 16bit
        char  alphabet = 'a';
        System.out.println(alphabet);

        //특수 상환 제외, 두 문자 이상 사용 불가, chỉ dùng 1 kí tự
        // char alphabets = 'ab';
        //글자 1
        char digit = '1';
        System.out.println(digit);
        // 문자열 (string) 자료형
        // 기술적으로는 char의 나열
        String word = "hello";
        String world = "Hello World";
        String sentence = "this is a String variable";

        //문자의 문자열의 차이
        //String letter = 'a'
        String letter = "a";
        //char charletter = "a"; //오류
        char charLetter = 'a';

        //Scanner 사용하기
        Scanner scanner = new Scanner(System.in);

        //scanner.nextLine() 사용자의 다음 Enter 입력까지 String으로 받아온다.

        String inputLine = scanner.nextLine();
        //사용자한테 입력을 두번 받는다.
        String inputLine1 = scanner.nextLine();
       // Enter를 기준으로
        String inputLine2 = scanner.nextLine();

        System.out.println(inputLine1);
        System.out.println(inputLine2);

        //int를 받고 싶으면 nextInt()
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        System.out.println(inputA);
        System.out.println(inputB);
        System.out.println(inputA+inputB);

        //Long를 받고 싶으면 nextLong()
        long inputLong = scanner.nextLong();
        System.out.println(inputLong);

        float inputFloat = scanner.nextFloat();
        double inputDouble = scanner.nextDouble();

        //enter를 기분으로 하지 않고, 구분되는 데이터를 기분으로 한다
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();
//        System.out.println(second);

        int inputInterger = scanner.nextInt();
        String nextLine = scanner.nextLine();
        System.out.println(inputInterger);
        System.out.println(nextLine);



    }
    }