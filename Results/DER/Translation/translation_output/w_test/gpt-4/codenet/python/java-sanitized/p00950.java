import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class p00950 {
    private static String base = "=+-*()01";
    private static Map<Character, Integer> mapping = new HashMap<>();
    private static Map<Integer, Integer> counter = new HashMap<>();
    private static int cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        for (char c : s.toCharArray()) {
            if (base.indexOf(c) != -1) {
                continue;
            }
            if (!mapping.containsKey(c)) {
                mapping.put(c, cnt++);
            }
            int v = mapping.get(c);
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        if (cnt > 8) {
            System.out.println(0);
            return;
        }

        int ans = Stream.of(new String[720]).parallel() // () -> 9! permutations
            .mapToInt(dummy -> checkAllPermutations(new Permutations(base.toCharArray()), new StringBuilder(), 0))
            .sum();
        System.out.println(ans);
    }

    private static int checkAllPermutations(Permutations permutations, StringBuilder current, int position) {
        if (position == cnt) {
            return solve(getFunction(current.toString())) ? 1 : 0;
        }
        int sum = 0;
        while (permutations.hasNext()) {
            current.append(permutations.next()[position]);
            sum += checkAllPermutations(permutations, current, position + 1);
            current.deleteCharAt(current.length() - 1);
        }
        return sum;
    }

    private static Reader getFunction(String b) {
        return new Reader() {
            int l = s.length();
            public char read(int cur) {
                if (cur >= l) {
                    return '$';
                }
                char c = s.charAt(cur);
                if (base.indexOf(c) != -1) {
                    return c;
                }
                return b.charAt(mapping.get(c));
            }
        };
    }

    private static boolean solve(Reader read) {
        MutableInt cur = new MutableInt(0);
        MutableInt failed = new MutableInt(0);
        Operator next = () -> cur.add(1);
        Operator error = () -> failed.set(1);

        Function number = () -> {
            int res = 0;
            if (read.read(cur.get()) != '0' && read.read(cur.get()) != '1') {
                error.operate();
            }
            boolean first = true;
            while (true) {
                char c = read.read(cur.get());
                if (c != '0' && c != '1') {
                    break;
                }
                if (!first && res == 0) {
                    error.operate();
                }
                res = (res << 1) ^ Character.getNumericValue(c);
                next.operate();
                first = false;
            }
            return res;
        };

        IntFunction factor = () -> {
            char c = read.read(cur.get());
            if (c == '-') {
                next.operate();
                return -factor.calculate();
            } else if (c == '(') {
                next.operate();
                int val = expr.calculate();
                if (read.read(cur.get()) != ')') {
                    error.operate();
                }
                next.operate();
                return val;
            }
            return number.calculate();
        };

        IntFunction term = () -> {
            int res = 1;
            while (true) {
                res *= factor.calculate();
                char c = read.read(cur.get());
                if (c != '*') {
                    break;
                }
                next.operate();
            }
            return res;
        };

        IntFunction expr = () -> {
            int res = 0;
            char op = '+';
            while (true) {
                if (op == '+') {
                    res += term.calculate();
                } else {
                    res -= term.calculate();
                }
                char c = read.read(cur.get());
                if (c != '+' && c != '-') {
                    break;
                }
                next.operate();
                op = c;
            }
            return res;
        };

        for (int i = 0; i < l; i++) {
            if (read.read(i) == '=') {
                int lv = expr.calculate();
                next.operate();
                int rv = expr.calculate();
                if (failed.get() == 0 && cur.get() == l) {
                    return lv == rv;
                }
                return false;
            }
        }
        return false;
    }

    interface MutableInt {
        int get();
        void add(int value);
        void set(int value);
    }

    interface Reader {
        char read(int cur);
    }

    interface IntFunction {
        int calculate();
    }

    interface Function {
        int calculate();
    }

    interface Operator {
        void operate();
    }

    static class Permutations {
        private char[] array;
        private int[] indexes;
        private boolean first;

        Permutations(char[] array) {
            this.array = array.clone();
            indexes = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                indexes[i] = i;
            }
            first = true;
        }

        public boolean hasNext() {
            if (first) {
                first = false;
                return true;
            }
            int i = indexes.length - 1;
            while (i > 0 && indexes[i - 1] >= indexes[i]) {
                i--;
            }
            if (i <= 0) {
                return false;
            }
            int j = indexes.length - 1;
            while (indexes[j] <= indexes[i - 1]) {
                j--;
            }
            swap(indexes, i - 1, j);
            j = indexes.length - 1;
            while (i < j) {
                swap(indexes, i, j);
                i++;
                j--;
            }
            return true;
        }

        public char[] next() {
            char[] result = new char[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[indexes[i]];
            }
            return result;
        }

        private void swap(int[] input, int a, int b) {
            int tmp = input[a];
            input[a] = input[b];
            input[b] = tmp;
        }
    }
}