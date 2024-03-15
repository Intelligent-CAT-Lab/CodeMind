import java.util.Scanner;

public class p02553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        int ans = -1000000000000000000;
        ans = Math.max(ans, a * c, a * d, b * c, b * d);
        System.out.println(ans);
    }
}