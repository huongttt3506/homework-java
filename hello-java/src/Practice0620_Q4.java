import java.util.Scanner;

public class Practice0620_Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        double[] scores = new double[3];
        System.out.print("이름 새 번 입력하세요 ");
        names[0] = scanner.nextLine();
        names[1] = scanner.nextLine();
        names[2] = scanner.nextLine();

        System.out.print("각각 점수가 입력하세요: ");
        scores[0] = scanner.nextDouble();
        scores[1] = scanner.nextDouble();
        scores[2] = scanner.nextDouble();

        System.out.println("name - " + names[0] + ", score - " + scores[0]);
        System.out.println("name - " + names[1] + ", score - " + scores[1]);
        System.out.println("name - " + names[2] + ", score - " + scores[2]);



        // 3. 각각 출력한다.
        String template = "name - %s, score - %.1f";
        System.out.println(String.format(template, names[0], scores[0]));
        System.out.println(String.format(template, names[1], scores[1]));
        System.out.println(String.format(template, names[2], scores[2]));
    }
}
