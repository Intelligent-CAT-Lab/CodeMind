import java.util.Scanner;

public class p02336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k > n) {
            System.out.println(0);
            System.exit(0);
        }
        long ans = 1;
        for (int i = 1; i < k; i++) {
            ans = (ans * (n - i)) / i;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}