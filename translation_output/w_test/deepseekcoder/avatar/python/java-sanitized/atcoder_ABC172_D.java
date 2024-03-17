import java.util.*;
import java.lang.*;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = n / i;
            ans += (long)i * (x + 1) * x / 2;
        }
        System.out.println(ans);
    }
}