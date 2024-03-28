import java.util.*;

public class p01979 {
    static long N;
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long INF = (long) Math.pow(10, 18);

    static long func(String S, int index, int cnt) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) return 0;
            char[] S_ = S.toCharArray();
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') continue;
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) (j + '0');
                    if (Long.parseLong(new String(S_).replace("?", "9")) > N) break;
                    else ans += (long) Math.pow(10, Arrays.toString(S_).length() - Arrays.toString(S_).replace("?", "").length());
                }
            }
            ans *= (cnt % 2 == 0 ? 1 : -1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = S.toCharArray();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(new String(S_), index + 4, cnt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        String S = "???????????????????????";
        System.out.println(func(S, 0, 0));
    }
}