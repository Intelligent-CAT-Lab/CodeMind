import java.util.*;

public class p00950 {
    private static final String BASE = "=+-*()01";
    private static String s;
    private static int l;
    private static Map<Character, Integer> mapping = new HashMap<>();
    private static Map<Integer, Integer> counter = new HashMap<>();
    private static int cnt = 0;

    public static void main(String[] args) {
        s = System.console().readLine();
        l = s.length();
        for (char c : s.toCharArray()) {
            if (BASE.indexOf(c) != -1) {
                continue;
            }
            if (!mapping.containsKey(c)) {
                mapping.put(c, cnt);
                cnt++;
            }
            int v = mapping.get(c);
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        if (cnt > 8) {
            System.out.println(0);
            return;
        }
        System.out.println(solve(get()));
    }

    private static int solve(char[] b) {
        int cur = 0;
        boolean failed = false;
        char[] read = b;
        int number() {
            int res = 0;
            if (read[cur] != '0' && read[cur] != '1') {
                failed = true;
            }
            boolean first = true;
            while (true) {
                char c = read[cur];
                if (c != '0' && c != '1') {
                    break;
                }
                if (!first && res == 0) {
                    failed = true;
                }
                res = (res << 1) ^ (c - '0');
                cur++; // "0" or "1"
                first = false;
            }
            return res;
        }
        int factor() {
            char c = read[cur];
            if (c == '-