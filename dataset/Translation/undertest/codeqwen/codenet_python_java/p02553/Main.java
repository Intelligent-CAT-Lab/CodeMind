import java.util.Scanner;

public class p02553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long ans = -1000000000000000000L;
        ans = Math.max(ans, (long) a * c, (long) a * d, (long) b * c, (long) b * d);
        System.out.println(ans);
    }
}