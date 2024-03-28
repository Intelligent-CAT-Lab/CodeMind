```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long N;
    static long ans = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = Long.parseLong(scanner.next());
        scanner.close();

        char[] S = new char[20];
        Arrays.fill(S, '?');

        func(S, 0, 0);
        System.out.println(ans);
    }

    public static void func(char[] S, int index, int cnt) {
        if (index == 20) {
            if (cnt == 0) {
                ans += 0;
                return;
            }
            char[] S_ = Arrays.copyOf(S, S.length);
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) ('0' + j);
                    if (Long.parseLong(new String(S_).replace('?', '9')) > N) {
                        break;
                    } else {
                        ans += Math.pow(10, countChar(S_, '?'));
                    }
                }
            }
            ans *= Math.pow(-1, cnt + 1);
            return;
        }
        func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = Arrays.copyOf(S, S.length);
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            func(S_, index + 4, cnt + 1);
        }
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

