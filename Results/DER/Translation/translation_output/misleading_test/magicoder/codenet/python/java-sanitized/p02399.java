import java.util.Scanner;

public class p02399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d %.10f", a / b, a % b, (double) a / b);
    }
}