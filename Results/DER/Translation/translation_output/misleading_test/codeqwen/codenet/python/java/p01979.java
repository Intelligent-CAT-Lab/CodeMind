Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static final int INF = (int) 1e18;
    static final int MOD = (int) 1e9 + 7;
    static final int N = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(func(S, 0, 0));
    }

    static int func(String S, int index, int cnt) {
        int ans = 0;
        if (index == N) {
            if (cnt == 0) {
                return 0;
            }
            char[] S_ = S.toCharArray();
            for (int i = 0; i < N; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) ('0' + j);
                    if (Integer.parseInt(String.valueOf(S_).replace('?', '9')) > Integer.parseInt(S)) {
                        break;
                    } else {
                        ans += (int) Math.pow(10, count(S_, '?'));
                    }
                }
                S_[i] = '?';
            }
            ans *= (-1) ** (cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = S.toCharArray();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(String.valueOf(S_), index + 4, cnt + 1);
        }
        return ans;
    }

    static int count(char[] S, char
