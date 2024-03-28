import java.util.*;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true, k);
        }
        System.out.println(ans);
    }

    public static int rec(int i, boolean isBlack, int k) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        if (isBlack) {
            return rec(i - 1, false, k) + rec(i - k, false, k);
        } else {
            return rec(i - 1, true, k);
        }
    }
}