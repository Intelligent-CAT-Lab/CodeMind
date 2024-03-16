import java.util.*;

public class p00379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n, m;
        a = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        int ans = 0;
        for (int y = 1; y < 50; y++) {
            int x = (y + a) * Math.pow(n, y);
            if (1 <= x <= m && y == Integer.parseInt(String.valueOf(x))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}