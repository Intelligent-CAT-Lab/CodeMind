import java.util.Scanner;

public class p01979 {
    private static final long INF = (long) 1e18;
    private static final int MOD = (int) 1e9 + 7;
    private static String N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLine();
        System.out.println(func("????????????????????", 0, 0));
        scanner.close();
    }

    private static long func(String S, int index, int cnt) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            StringBuilder S_ = new StringBuilder(S);
            for (int i = 0; i < 20; i++) {
                if (S_.charAt(i) != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_.setCharAt(i, Character.forDigit(j, 10));
                    if (new StringBuilder(S_.toString().replace('?', '9')).compareTo(N) > 0) {
                        break;
                    } else {
                        ans += Math.pow(10, countChar(S_.toString(), '?'));
                    }
                }
                S_.setCharAt(i, '?');
            }
            ans *= Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            StringBuilder S_ = new StringBuilder(S);
            S_.setCharAt(index, '5');
            S_.setCharAt(index + 1, '1');
            S_.setCharAt(index + 3, '3');
            ans += func(S_.toString(), index + 4, cnt + 1);
        }
        return ans;
    }

    private static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}