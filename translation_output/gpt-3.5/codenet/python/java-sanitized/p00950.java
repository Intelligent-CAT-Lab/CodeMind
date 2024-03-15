import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p00950 {
    static String base = "=+-*()01";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        HashMap<Character, Integer> mapping = new HashMap<>();
        HashMap<Integer, Integer> counter = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (base.contains(Character.toString(c))) {
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
        char[] b = base.toCharArray();
        Set<Character> permSet = new HashSet<>();
        for (char c : b) {
            permSet.add(c);
        }

        Character[] permChars = permSet.toArray(new Character[0]);

        permutation(permChars, 0, ans, s, l, mapping, counter);

        System.out.println(ans[0]);

    }

    static void permutation(Character[] b, int index, int[] ans, String s, int l, HashMap<Character, Integer> mapping, HashMap<Integer, Integer> counter) {
        if (index == b.length) {
            solve(b, ans, s, l);
            return;
        }

        for (int i = index; i < b.length; i++) {
            char temp = b[index];
            b[index] = b[i];
            b[i] = temp;

            permutation(b, index + 1, ans, s, l, mapping, counter);

            temp = b[index];
            b[index] = b[i];
            b[i] = temp;
        }
    }

    static void solve(Character[] b, int[] ans, String s, int l) {
        int[] index = {0};
        StringBuilder sb = new StringBuilder(s);

        String res = expr(b, sb, index);
        if (res.contains("$")) {
            return;
        }

        index[0]++;

        String res2 = expr(b, sb, index);
        if (res2.contains("$")) {
            return;
        }

        if (index[0] == l) {
            if (res.equals(res2)) {
                ans[0]++;
            }
        }
    }

    static String expr(Character[] b, StringBuilder read, int[] index) {
        int res = 0;
        char op = '+';
        while (true) {
            if (op == '+') {
                res += term(b, read, index);
            } else {
                res -= term(b, read, index);
            }
            if (index[0] >= read.length()) {
                return "$";
            }

            char c = b[index[0]];
            if (c != '+' && c != '-') {
                break;
            }
            index[0]++;
            op = c;
        }
        return Integer.toString(res);
    }

    static int term(Character[] b, StringBuilder read, int[] index) {
        int res = 1;
        while (true) {
            res *= factor(b, read, index);
            if (index[0] >= read.length() || b[index[0]] != '*') {
                break;
            }
            index[0]++;
        }
        return res;
    }

    static int factor(Character[] b, StringBuilder read, int[] index) {
        char c = b[index[0]];
        index[0]++;
        if (c == '-') {
            return -factor(b, read, index);
        } else if (c == '(') {
            int val = expr(b, read, index);
            if (index[0] >= read.length() || b[index[0]] != ')') {
                return -1;
            }
            index[0]++;
            return val;
        } else {
            return number(b, c);
        }
    }

    static int number(Character[] b, char c) {
        int res = 0;
        if (!(c == '0' || c == '1')) {
            return -1;
        }
        boolean first = true;
        while (true) {
            if (!(c == '0' || c == '1')) {
                break;
            }
            if (!first && res == 0) {
                return -1;
            }
            res = (res << 1) ^ Character.getNumericValue(c);
            if ((c != '0' && c != '1') || b.length == 0) {
                break;
            }
            c = b[0];
        }
        return res;
    }
}