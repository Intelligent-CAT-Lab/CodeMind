import java.util.*;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true);
        }
        System.out.println(ans);
    }

    @SuppressWarnings("unused")
    private static int rec(int i, boolean isBlack) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return isBlack ? 1 : 0;
        }
        if (isBlack) {
            return rec(i - 1, false) + rec(i - k, false);
        } else {
            return rec(i - 1, true) + rec(i - k, true);
        }
    }
}