import java.util.*;

public class p01979 {
    static long N;
    static long[][] dp;
    static String S;

    static long func(int index, int cnt) {
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            long ans = 0;
            for (int i = 0; i < 20; i++) {
                if (S.charAt(i) != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    String S_ = S.substring(0, i) + j + S.substring(i + 1);
                    if (Long.parseLong(S_.replace('?', '9')) > N) {
                        break;
                    } else {
                        ans += Math.pow(10, S_.chars().filter(ch -> ch == '?').count());
                    }
                }
            }
            ans *= Math.pow(-1, cnt + 1);
            return ans;
        }
        long ans = func(index + 1, cnt);
        if (index <= 16) {
            String S_ = S.substring(0, index) + "5" + S.substring(index + 1, index + 2) + "1" + S.substring(index + 3, index + 4);
            ans += func(index + 4, cnt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        S = "?".repeat(20);
        System.out.println(func(0, 0));
    }
}