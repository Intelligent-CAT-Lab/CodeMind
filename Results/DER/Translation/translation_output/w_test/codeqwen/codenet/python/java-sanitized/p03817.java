import java.util.Scanner;

public class p03817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int q = x / 11;
        ans += 2 * q;
        q = x % 11 / 6;
        ans += q;
        if (x % 11 % 6 > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}