import java.util.Scanner;

public class p02553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, (long) a * c);
        ans = Math.max(ans, (long) a * d);
        ans = Math.max(ans, (long) b * c);
        ans = Math.max(ans, (long) b * d);
        System.out.println(ans);

        scanner.close();
    }
}