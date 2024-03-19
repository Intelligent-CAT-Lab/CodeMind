import java.util.*;
public class p00379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for (int y = 1; y <= 50; y++) {
            int x = (int) Math.pow(y + a, n);
            if (1 <= x && x <= m && y == sum(x)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int sum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}