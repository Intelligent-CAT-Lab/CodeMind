import java.util.*;

public class p01979 {
    final static int INF = (int) 1e18;
    final static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[20];
        Arrays.fill(S, '?');
        System.out.println(func(S, 0, 0));
    }

    public static int func(int[] S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            int[] S_ = Arrays.copyOf(S, 20);
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = j;
                    if (isGreater(S_, 0, 20)) {
                        break;
                    }
                    ans += (int) Math.pow(10, S_.length - S_.count('?'));
                }
            }
            ans *= (1 << (cnt + 1));
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            int[] S_ = Arrays.copyOf(S, 20);
            S_[index] = 5;
            S_[index + 1] = 1;
            S_[index + 3] = 3;
            ans += func(S_, index + 4, cnt + 1);
        }
        return ans;
    }

    public static boolean isGreater(int[] S, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += S[i];
        }
        return sum > N;
    }
}