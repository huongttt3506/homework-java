import java.util.Scanner;

public class D1ArrayAndInput {
    public void main(String[] args) {
        // 산용자에게 숫자 하나를 입력받고
        // 그 만큼의 이름을 입력받는 프로그렘
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextLine();
        String[] names = new String[n];
        names[0] = scanner.nextLine();
        names[1] = scanner.nextLine();
        names[2] = scanner.nextLine();

    }
}
