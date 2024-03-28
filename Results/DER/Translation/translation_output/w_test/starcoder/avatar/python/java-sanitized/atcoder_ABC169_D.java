import java.util.*;
public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            int cnt = 0;
            while (x % i == 0) {
                cnt++;
                x /= i;
            }
            if (cnt > 0) {
                ans += cnt;
            }
        }
        if (x > 1) {
            ans++;
        }
        System.out.println(ans);
    }
}