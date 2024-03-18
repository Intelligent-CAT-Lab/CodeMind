```java
import java.util.*;

public class Main {

    static final long inf = (long) Math.pow(10, 20);
    static final double eps = 1.0 / Math.pow(10, 13);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<List<Object>, long[]> fm = new HashMap<>();

        List<Object> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                int ci = c - '0';
                if (!a.isEmpty() && a.get(a.size() - 1) instanceof Integer) {
                    a.set(a.size() - 1, (int) a.get(a.size() - 1) * 10 + ci);
                } else {
                    a.add(ci);
                }
            } else {
                a.add(c);
            }
        }

        long[] result = f(a, fm);
        System.out.println(result[1]);
    }

    static long[] f(List<Object> a, Map<List<Object>, long[]> fm) {
        List<Object> key = new ArrayList<>(a);
        if (fm.containsKey(key)) {
            return fm.get(key);
        }

        if (a.size() == 2) {
            long[] r = new long[]{inf, -inf};
            fm.put(key, r);
            return r;
        }

        int start = 0;
        for (int i = 0; i < a.size(); i++) {
            if (!(a.get(i) instanceof Character) || (i > 0 && a.get(i - 1).equals('('))) {
                if (i > 0) {
                    start = i;
                }
                break;
            }
        }

        int end = a.size();
        for (int i = a.size() - 1; i >= 0; i--) {
            if (!(a.get(i) instanceof Character) || (i + 1 < a.size() && a.get(i + 1).equals(')'))) {
                end = i + 1;
                break;
            }
        }

        if (end - start == 1) {
            long[] r = {(int) a.get(start), (int) a.get(start)};
            fm.put(key, r);
            return r;
        }

        List<Long> ri = new ArrayList<>();
        List<Long> ra = new ArrayList<>();
        int l = a.size();
        for (int i = 1; i < a.size() - 1; i++) {
            if (!a.get(i).equals('+') && !a.get(i).equals('-') ||
                    (i > 1 && a.get(i - 2).equals('(')) || (i + 2 < l && a.get(i + 2).equals(')'))) {
                continue;
            }
            long[] fl = f(a.subList(0, i), fm);
            long[] fr = f(a.subList(i + 1, a.size()), fm);
            if (a.get(i).equals('+')) {
                ri.add(fl[0] + fr[0]);
                ra.add(fl[1] + fr[1]);
            } else {
                ri.add(fl[0] - fr[1]);
                ra.add(fl[1] - fr[0]);
            }
        }

        long minRi = ri.stream().min(Long::compare).orElse(Long.MAX_VALUE);
        long maxRa = ra.stream().max(Long::compare).orElse(Long.MIN_VALUE);
        long[] r = {minRi, maxRa};
        fm.put(key, r);
        return r;
    }
}
```

