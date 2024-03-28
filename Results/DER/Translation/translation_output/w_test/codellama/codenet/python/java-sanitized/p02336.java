import java.util.Scanner;

public class p02336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k > n) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 1; i <= k; i++) {
            ans *= n - i;
            ans /= i;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}