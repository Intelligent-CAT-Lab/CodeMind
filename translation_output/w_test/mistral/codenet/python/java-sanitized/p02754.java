import java.util.Scanner;

public class p02754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();

        int k = n / (a + b);
        int p = n % (a + b);

        System.out.println(k * a + Math.min(p, a));
    }
}