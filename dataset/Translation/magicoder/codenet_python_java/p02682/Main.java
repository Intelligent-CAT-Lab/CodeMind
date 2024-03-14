import java.util.Scanner;

public class p02682 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        ans += Math.min(a, k);
        k -= Math.min(a, k);
        ans += 0 * Math.min(b, k);
        k -= Math.min(b, k);
        ans -= Math.min(c, k);
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}