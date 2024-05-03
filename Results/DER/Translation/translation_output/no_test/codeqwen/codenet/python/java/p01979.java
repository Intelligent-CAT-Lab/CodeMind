Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static final int INF = (int) 1e18;
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(func(new char[20], 0, 0, N));
    }

    static long func(char[] S, int index, int cnt, long N) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            char[] S_ = S.clone();
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) ('0' + j);
                    if (Long.parseLong(new String(S_).replace('?', '9')) > N) {
                        break;
                    } else {
                        ans += (long) Math.pow(10, count(S_, '?'));
                    }
                }
            }
            ans *= Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt, N);
        if (index <= 16) {
            char[] S_ = S.clone();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(S_, index + 4, cnt + 1, N);
        }
        return ans;
    }

    static int count(char[] S, char c) {
        int count = 0;
        for (char s : S) {
            
