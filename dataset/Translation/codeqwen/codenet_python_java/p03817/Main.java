import java.util.Scanner;

public class p03817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int q = x / 11;
        ans += 2 * q;
        int r = x % 11;
        q = r / 6;
        ans += q;
        if (r % 6 != 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}