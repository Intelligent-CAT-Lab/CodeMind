import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static long N;
    static long INF = (long) Math.pow(10, 18);
    static long MOD = (long) Math.pow(10, 9) + 7;

    static long func(String S, int index, int cnt) {
        long ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            String[] S_ = S.split("");
            for (int i = 0; i < 20; i++) {
                if (!S_[i].equals("?")) {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = String.valueOf(j);
                    if (Long.parseLong(String.join("", S_).replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += (long) Math.pow(10, Arrays.stream(S_).filter(s -> s.equals("?")).count());
                    }
                }
            }
            ans *= (long) Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            String[] S_ = S.split("");
            S_[index] = "5";
            S_[index + 1] = "1";
            S_[index + 3] = "3";
            ans += func(String.join("", S_), index + 4, cnt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        String S = "?".repeat(20);
        System.out.println(func(S, 0, 0));
    }
}