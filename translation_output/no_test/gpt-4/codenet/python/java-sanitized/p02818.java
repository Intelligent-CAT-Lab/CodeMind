import java.util.Scanner;

public class p02818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println((a - k) + " " + b);
            System.exit(0);
        }
        System.out.println("0 " + Math.max(b - k, 0));
    }
}