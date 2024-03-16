```java
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    static long INF = (long) Math.pow(10, 18);
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long N;

    public static void main(String[] args) {
        N = Long.parseLong(args[0]);
        char[] S = new char[20];
        Arrays.fill(S, '?');
        System.out.println(func(S, 0, 0));
    }

    public static long func(char[] S, int index, int cnt) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            char[] S_ = Arrays.copyOf(S, S.length);
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) ('0' + j);
                    if (Long.parseLong(new String(S_).replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += Math.pow(10, countChar(S_, '?'));
                    }
                }
            }
            ans *= Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = Arrays.copyOf(S, S.length);
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(S_, index + 4, cnt + 1);
        }
        return ans;
    }

    public static int countChar(char[] arr, char c) {
        int count = 0;
        for (char ch : arr) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}
```

