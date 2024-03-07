import java.util.Scanner;

public class p02251 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int x = 25; x >= 1; x /= 2) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}