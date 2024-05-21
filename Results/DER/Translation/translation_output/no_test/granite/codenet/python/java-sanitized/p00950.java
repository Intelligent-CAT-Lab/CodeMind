import java.util.*;

public class p00950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String base = "=+-*()01";
        String s = sc.next();
        int l = s.length();
        Map<Character, Integer> mapping = new HashMap<>();
        Map<Integer, Integer> counter = new HashMap<>();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (base.indexOf(c)!= -1) {
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

        long ans = 0;
        for (List<Character> b : permutations(base, cnt)) {
            int cur = 0;
            int failed = 0;
            int[] read = new int[l];
            for (int i = 0; i < l; i++) {
                if (i < l && base.indexOf(s.charAt(i))!= -1) {
                    read[i] = s.charAt(i);
                } else {
                    read[i] = b.get(mapping.get(s.charAt(i)));
                }
            }
            int lv = expr(read, cur, failed);
            if (cur!= l || failed!= 0) {
                continue;
            }
            cur++;
            if (cur == l || read[cur]!= '=') {
                continue;
            }
            cur++;
            int rv = expr(read, cur, failed);
            if (cur!= l || failed!= 0) {
                continue;
            }
            if (lv == rv) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    static int expr(int[] read, int cur, int failed) {
        int res = term(read, cur, failed);
        while (cur < read.length && (read[cur] == '+' || read[cur] == '-')) {
            if (read[cur] == '+') {
                cur++;
                res += term(read, cur, failed);
            } else {
                cur++;
                res -= term(read, cur, failed);
            }
        }
        return res;
    }

    static int term(int[] read, int cur, int failed) {
        int res = factor(read, cur, failed);
        while (cur < read.length && read[cur] == '*') {
            cur++;
            res *= factor(read, cur, failed);
        }
        return res;
    }

    static int factor(int[] read, int cur, int failed) {
        if (cur < read.length && read[cur] == '-') {
            cur++;
            return -factor(read, cur, failed);
        } else if (cur < read.length && read[cur] == '(') {
            cur++;
            int val = expr(read, cur, failed);
            if (cur >= read.length || read[cur]!= ')') {
                failed = 1;
            }
            cur++;
            return val;
        }
        return number(read, cur, failed);
    }

    static int number(int[] read, int cur, int failed) {
        int res = 0;
        if (cur < read.length && (read[cur] == '0' || read[cur] == '1')) {
            res = read[cur] - '0';
            cur++;
        } else {
            failed = 1;
        }
        while (cur < read.length && (read[cur] == '0' || read[cur] == '1')) {
            if (res == 0 && read[cur] == '0') {
                failed = 1;
            }
            res = (res << 1) ^ (read[cur] - '0');
            cur++;
        }
        return res;
    }

    static List<List<Character>> permutations(String base, int cnt) {
        List<List<Character>> result = new ArrayList<>();
        if (cnt == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        for (char c : base.toCharArray()) {
            List<List<Character>> tmp = permutations(base, cnt - 1);
            for (List<Character> list : tmp) {
                list.add(c);
            }
            result.addAll(tmp);
        }
        return result;
    }
}