import java.util.*;
import java.io.*;

public class Main {
    int N;
    long MOD = 1000000007L;
    String[] TOKENS = {"A", "C", "G", "T"};
    Map<String, Long>[] memo;

    Main() {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.close();
        this.memo = new Map[N + 1];
        for (int i = 0; i < this.memo.length; ++i) {
            this.memo[i] = new HashMap<String, Long>();
        }
    }

    long calc() {
        return dfs(0, "TTT");
    }

    boolean isOK(String last4) {
        if (last4.contains("AGC")) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            char[] vals = last4.toCharArray();
            vals[i] = last4.charAt(i + 1);
            vals[i + 1] = last4.charAt(i);
            String s = new String(vals);
            if (s.contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    long dfs(int current, String last3) {
        if (this.memo[current].containsKey(last3)) {
            return (Long) (this.memo[current].get(last3));
        }
        if (current == N) {
            return 1;
        }
        long result = 0;
        for (String c : TOKENS) {
            if (isOK(last3 + c)) {
                result = (result + dfs(current + 1, last3.substring(1, last3.length()) + c)) % MOD;
            }
        }
        memo[current].put(last3, result);
        return result;
    }

    public static void main(String[] args) {
        Main ins = new Main();
        System.out.println(ins.calc());
    }
}