import java.util.Scanner;

public class p02682 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, k;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        k = scanner.nextInt();
        int ans = 0;
        ans += 1 * (Math.min(a, k));
        k -= Math.min(a, k);
        ans += 0 * (Math.min(b, k));
        k -= Math.min(b, k);
        ans += (-1) * (Math.min(c, k));
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}