import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class p00950 {

    private static final String base = "=+-*()01";
    private static String s;
    private static int l;
    private static Map<Character, Integer> mapping = new HashMap<>();
    private static Map<Integer, Integer> counter = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        l = s.length();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (base.indexOf(c) >= 0) {
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

        List<Character> chars = new ArrayList<>();
        for (char c : base.toCharArray()) {
            chars.add(c);
        }

        int ans = 0;
        Permutation<Character> permutations = new Permutation<>(chars);
        while (permutations.hasNext()) {
            List<Character> b = permutations.next();
            if (b.size() < cnt) continue;
            ans += (solve(getReader(b.subList(0, cnt))) ? 1 : 0);
        }
        System.out.println(ans);
    }

    // Define the reader interface
    interface Reader {
        char read(int pos);
    }

    // Define class to iteratively produce permutations
    static class Permutation<E> {
        private List<E> elements;
        private int[] indexes;
        private boolean first;

        Permutation(List<E> elements) {
            this.elements = elements;
            indexes = new int[elements.size()];
            for (int i = 0; i < elements.size(); i++) {
                indexes[i] = i;
            }
            first = true;
        }

        boolean hasNext() {
            if (first) {
                first = false;
                return true;
            }
            int i = indexes.length - 1;
            while (i > 0 && indexes[i - 1] >= indexes[i])
                i--;
            if (i <= 0)
                return false;

            int j = indexes.length - 1;
            while (indexes[j] <= indexes[i - 1])
                j--;

            int temp = indexes[i - 1];
            indexes[i - 1] = indexes[j];
            indexes[j] = temp;

            j = indexes.length - 1;
            while (i < j) {
                temp = indexes[i];
                indexes[i] = indexes[j];
                indexes[j] = temp;
                i++;
                j--;
            }
            return true;
        }

        List<E> next() {
            List<E> result = new ArrayList<>(elements.size());
            for (int index : indexes) {
                result.add(elements.get(index));
            }
            return result;
        }
    }
    
    private static Reader getReader(final List<Character> b) {
        return new Reader() {
            @Override
            public char read(int pos) {
                if (l <= pos) {
                    return '$';
                }
                char ch = s.charAt(pos);
                if (base.indexOf(ch) >= 0) {
                    return ch;
                }
                return b.get(mapping.get(ch));
            }
        };
    }
    
    // Replace the "solve" and other nested function logic with a class and methods
    static private boolean solve(Reader read) {
        // Declare instance variables equivalent to nonlocal variables
        class Context {
            int cur = 0;
            boolean failed = false;
            
            // Define methods equivalent to the local functions in Python
            void next() {
                cur++;
            }

            void error() {
                failed = true;
            }

            int number() {
                int res = 0;
                if ("01".indexOf(read.read(cur)) == -1) {
                    error();
                }
                boolean first = true;
                while (true) {
                    char c = read.read(cur);
                    if ("01".indexOf(c) == -1) {
                        break;
                    }
                    if (!first && res == 0) {
                        error();
                    }
                    res = (res << 1) ^ Integer.parseInt(String.valueOf(c));
                    next();
                    first = false;
                }
                return res;
            }

            int factor() {
                char c = read.read(cur);
                if (c == '-') {
                    next();
                    return -factor();
                } else if (c == '(') {
                    next();
                    int val = expr();
                    if (read.read(cur) != ')') {
                        error();
                    }
                    next();
                    return val;
                }
                return number();
            }

            int term() {
                int res = 1;
                while (true) {
                    res *= factor();
                    char c = read.read(cur);
                    if (c != '*') {
                        break;
                    }
                    next();
                }
                return res;
            }

            int expr() {
                int res = 0;
                char op = '+';
                while (true) {
                    if (op == '+') {
                        res += term();
                    } else {
                        res -= term();
                    }
                    char c = read.read(cur);
                    if ("+-".indexOf(c) == -1) {
                        break;
                    }
                    next();
                    op = c;
                }
                return res;
            }
        }

        Context context = new Context();

        // Here the sum logic is replaced by an iteration and count
        int equalsCount = 0;
        for (int i = 0; i < l; i++) {
            if (read.read(i) == '=') {
                equalsCount++;
            }
        }

        if (equalsCount != 1) {
            return false;
        }
        int lv = context.expr();
        context.next();
        int rv = context.expr();

        return !context.failed && context.cur == l && lv == rv;
    }
}