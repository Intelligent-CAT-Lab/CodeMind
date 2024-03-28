import java.util.*;

public class p01979 {
    static long N;
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long INF = (long) Math.pow(10, 18);
    static StringBuilder S;

    static long func(int index, int cnt) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) return 0;
            S = new StringBuilder(S.toString().replace("?", "9"));
            for (int i = 0; i < 20; i++) {
                if (S.charAt(i) != '?') continue;
                for (int j = 0; j < 10; j++) {
                    S.setCharAt(i, (char) (j + '0'));
                    if (Long.parseLong(S.toString()) > N) break;
                    else ans += (long) Math.pow(10, S.toString().length() - S.toString().replace("?", "").length());
                }
            }
            ans *= (cnt % 2 == 0 ? 1 : -1);
            return ans;
        }
        ans += func(index + 1, cnt);
        if (index <= 16) {
            S.setCharAt(index, '5');
            S.setCharAt(index + 1, '1');
            S.setCharAt(index + 3, '3');
            ans += func(index + 4, cnt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        S = new StringBuilder("????????????????????");
        System.out.println(func(0, 0));
    }
}