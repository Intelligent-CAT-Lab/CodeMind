import java.util.Scanner;

public class p02553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long ans = -1000000000000000000L;
        ans = Math.max(ans, a * c);
        ans = Math.max(ans, a * d);
        ans = Math.max(ans, b * c);
        ans = Math.max(ans, b * d);
        System.out.println(ans);
    }
}