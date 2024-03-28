import java.util.*;

public class p00950 {
    public static void main(String[] args) {
        String base = "=+-*()01";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        HashMap<Character, Integer> mapping = new HashMap<>();
        HashMap<Integer, Integer> counter = new HashMap<>();
        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (base.contains(String.valueOf(c))) {
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
            System.exit(0);
        }

        int[] ans = {0};

        for (String b : getPermutations(base, cnt)) {
            ans[0] += solve(s, b, mapping, l);
        }
        System.out.println(ans[0]);
    }

    private static int solve(String s, String b, HashMap<Character, Integer> mapping, int l) {
        int[] cur = {0};
        int[] failed = {0};

        String read = (int index) -> {
            if (index >= l) {
                return '$';
            }
            char c = s.charAt(index);
            if (base.contains(String.valueOf(c))) {
                return c;
            }
            return b.charAt(mapping.get(c));
        };

        if (Arrays.stream(s.split("")).filter(ch -> ch.equals("=")).count() != 1) {
            return 0;
        }

        int[] lv = {expr(cur, read)};
        cur[0] += 1; // "="
        int[] rv = {expr(cur, read)};

        if (failed[0] == 0 && cur[0] == l) {
            return lv[0] == rv[0] ? 1 : 0;
        }
        return 0;
    }

    private static int expr(int[] cur, Function<Integer, Character> read) {
        int[] res = {0};
        char[] op = {'+'};

        while (true) {
            if (op[0] == '+') {
                res[0] += term(cur, read);
            } else {
                res[0] -= term(cur, read);
            }

            char c = read.apply(cur[0]);
            if (c != '+' && c != '-') {
                break;
            }

            cur[0]++; // "+" or "-"
            op[0] = c;
        }
        return res[0];
    }

    private static int term(int[] cur, Function<Integer, Character> read) {
        int[] res = {1};

        while (true) {
            res[0] *= factor(cur, read);

            char c = read.apply(cur[0]);
            if (c != '*') {
                break;
            }

            cur[0]++; // "*"
        }
        return res[0];
    }

    private static int factor(int[] cur, Function<Integer, Character> read) {
        char c = read.apply(cur[0]);

        if (c == '-') {
            cur[0]++; // "-"
            return -factor(cur, read);
        } else if (c == '(') {
            cur[0]++; // "("
            int val = expr(cur, read);
            if (read.apply(cur[0]) != ')') {
                return 0;
            }
            cur[0]++; // ")"
            return val;
        } else {
            return number(cur, read);
        }
    }

    private static int number(int[] cur, Function<Integer, Character> read) {
        int res = 0;

        if (read.apply(cur[0]) != '0' && read.apply(cur[0]) != '1') {
            return 0;
        }

        boolean first = true;
        while (true) {
            char c = read.apply(cur[0]);
            if (c != '0' && c != '1') {
                break;
            }
            if (!first && res == 0) {
                return 0;
            }
            res = (res << 1) ^ Integer.parseInt(String.valueOf(c));
            cur[0]++; // "0" or "1"
            first = false;
        }
        return res;
    }

    private static List<String> getPermutations(String base, int cnt) {
        List<String> permutations = new ArrayList<>();
        generatePermutations(base.toCharArray(), cnt, new ArrayList<>(), new boolean[base.length()], permutations);
        return permutations;
    }

    private static void generatePermutations(char[] baseArr, int cnt, List<Character> current, boolean[] used, List<String> result) {
        if (current.size() == cnt) {
            StringBuilder sb = new StringBuilder();
            for (char c : current) {
                sb.append(c);
            }
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < baseArr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(baseArr[i]);
                generatePermutations(baseArr, cnt, current, used, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}