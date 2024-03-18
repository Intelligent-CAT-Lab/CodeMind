import java.util.Scanner;

public class p03337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int maxResult = Math.max(Math.max(a + b, a - b), a * b);
        System.out.println(maxResult);
    }
}