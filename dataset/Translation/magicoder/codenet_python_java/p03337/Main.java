import java.util.Scanner;

public class p03337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int max = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(max);
    }
}