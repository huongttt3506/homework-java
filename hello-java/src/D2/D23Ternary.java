package D2;

public class D23Ternary {
    public static void main(String[] args) {
        // 삼항 연산자
        int temperature1 = 37;
        int temperature2 = 39;
        // ? 앞의 조건이 참이면, : 의 왼쪽
        // ? 앞의 조건이 거짓이면, : 의 오른쪽
        // 으로 결과가 나오는 연산자
        String message1 = (temperature1 < 38) ? "OK" : "fever";
        String message2 = (temperature2 < 38) ? "OK" : "fever";
        System.out.println(message1);
        System.out.println(message2);
        int result1 = (temperature1 < 38) ? 10 : 20; //ok
        int result2 = (temperature2 < 38) ? 10 : 20; //fever


    }
}
