import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class p00950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        int[] mapping = new int[256];
        int[] counter = new int[8];
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '=' || c == '+' || c == '-' || c == '*' || c == '(' || c == ')') {
                continue;
            }
            if (mapping[c] == 0) {
                mapping[c] = cnt++;
            }
            counter[mapping[c]]++;
        }
        if (cnt > 8) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int[] b : permutations(Arrays.copyOf(mapping, cnt))) {
            ans += solve(get(b));
        }
        System.out.println(ans);
    }

    private static int[] permutations(int[] mapping) {
        int[][] result = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                result[i][j] = mapping[j];
            }
        }
        return result;
    }

    private static int solve(int[] b) {
        int cur = 0;
        int failed = 0;
        int[] read = new int[l];
        for (int i = 0; i < l; i++) {
            read[i] = b[mapping[s.charAt(i)]];
        }
        return solve(read, cur, failed);
    }

    private static int solve(int[] read, int cur, int failed) {
        if (sum(read, cur, l) != 1) {
            return 0;
        }
        int lv = expr(read, cur, failed);
        cur++;
        int rv = expr(read, cur, failed);
        if (!failed && cur == l) {
            return lv == rv;
        }
        return 0;
    }

    private static int expr(int[] read, int cur, int failed) {
        int res = 1;
        while (read[cur] != '+' && read[cur] != '-') {
            res *= factor(read, cur, failed);
            cur++;
        }
        return res;
    }

    private static int factor(int[] read, int cur, int failed) {
        if (read[cur] == '-') {
            cur++;
            return -factor(read, cur, failed);
        } else if (read[cur] == '(') {
            cur++;
            int val = expr(read, cur, failed);
            if (read[cur] != ')') {
                failed = 1;
            }
            cur++;
            return val;
        }
        return number(read, cur, failed);
    }

    private static int number(int[] read, int cur, int failed) {
        int res = 0;
        if (read[cur] != '0' && read[cur] != '1') {
            failed = 1;
        }
        int first = 1;
        while (read[cur] == '0' || read[cur] == '1') {
            if (!first && res == 0) {
                failed = 1;
            }
            res = (res << 1) ^ read[cur];
            cur++;
            first = 0;
        }
        return res;
    }

    private static int sum(int[] read, int cur, int l) {
        int res = 0;
        for (int i = cur; i < l; i++) {
            if (read[i] == '=') {
                res++;
            }
        }
        return res;
    }

    private static int[] get(int[] b) {
        int[] read = new int[l];
        for (int i = 0; i < l; i++) {
            read[i] = b[mapping[s.charAt(i)]];
        }
        return read;
    }
}