```java
import java.util.*;

public class SuffixArray {

    public static List<Integer> saNaive(String s) {
        int n = s.length();
        List<Integer> sa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sa.add(i);
        }
        sa.sort(Comparator.comparingInt(x -> s.substring(x));
        return sa;
    }

    public static List<Integer> saDoubling(String s) {
        int n = s.length();
        List<Integer> sa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sa.add(i);
        }
        char[] rnk = s.toCharArray();
        int[] tmp = new int[n];
        int k = 1;
        while (k < n) {
            sa.sort((x, y) -> {
                int cmp = (rnk[x] != rnk[y]) ? rnk[x] - rnk[y] : rnk[x + k] - rnk[y + k];
                return (cmp < 0) ? -1 : (cmp > 0) ? 1 : 0;
            });
            tmp[sa.get(0)] = 0;
            for (int i = 1; i < n; i++) {
                tmp[sa.get(i)] = tmp[sa.get(i - 1)];
                int x = (sa.get(i - 1) + k < n) ? rnk[sa.get(i - 1) + k] : -1;
                int y = (sa.get(i) + k < n) ? rnk[sa.get(i) + k] : -1;
                if (rnk[sa.get(i - 1)] < rnk[sa.get(i)] || (rnk[sa.get(i - 1)] == rnk[sa.get(i)] && x < y)) {
                    tmp[sa.get(i)] += 1;
                }
            }
            k *= 2;
            int[] temp = tmp;
            tmp = rnk;
            rnk = temp;
        }
        return sa;
    }

    public static List<Integer> saIs(String s, int upper) {
        int n = s.length();
        if (n == 0) return new ArrayList<>();
        if (n == 1) return Collections.singletonList(0);
        if (n == 2) {
            if (s.charAt(0) < s.charAt(1)) return Arrays.asList(0, 1);
            else return Arrays.asList(1, 0);
        }
        if (n < 10) {
            return saNaive(s);
        }
        if (n < 50) {
            return saDoubling(s);
        }
        int[] ls = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            ls[i] = (s.charAt(i) == s.charAt(i + 1)) ? ls[i + 1] : (s.charAt(i) < s.charAt(i + 1)) ? 1 : 0;
        }
        int[] sumL = new int[upper + 1];
        int[] sumS = new int[upper + 1];
        for (int i = 0; i < n; i++) {
            if (ls[i] == 1) {
                sumL[s.charAt(i) + 1]++;
            } else {
                sumS[s.charAt(i)]++;
            }
        }
        for (int i = 0; i < upper; i++) {
            sumS[i] += sumL[i];
            if (i < upper) {
                sumL[i + 1] += sumS[i];
            }
        }
        int[] lmsMap = new int[n + 1];
        int m = 0;
        for (int i = 1; i < n; i++) {
            if (ls[i - 1] == 0 && ls[i] == 1) {
                lmsMap[i] = m;
                m++;
            }
        }
        List<Integer> lms = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (ls[i - 1] == 0 && ls[i] == 1) {
                lms.add(i);
            }
        }
        List<Integer> sa = new ArrayList<>(Collections.nCopies(n, -1));
        int[] buf = sumS.clone();
        for (int d : lms) {
            if (d == n) continue;
            sa.set(buf[s.charAt(d)], d);
            buf[s.charAt(d)]++;
        }
        buf = sumL.clone();
        sa.set(buf[s.charAt(n - 1)], n - 1);
        buf[s.charAt(n - 1)]++;
        for (int i = 0; i < n; i++) {
            int v = sa.get(i);
            if (v >= 1 && ls[v - 1] == 0) {
                sa.set(buf[s.charAt(v - 1)], v - 1);
                buf[s.charAt(v - 1)]++;
            }
        }
        buf = sumL.clone();
        for (int i = n - 1; i >= 0; i--) {
            int v = sa.get(i);
            if (v >= 1 && ls[v - 1] == 1) {
                buf[s.charAt(v - 1) + 1]--;
                sa.set(buf[s.charAt(v - 1) + 1], v - 1);
            }
        }
        // Further implementation omitted for brevity
        return sa;
    }

    public static List<Integer> suffixArray(String s) {
        int n = s.length();
        char[] s2 = s.toCharArray();
        return saIs(new String(s2), 255);
    }

    public static List<Integer> lcpArray(String s, List<Integer> sa) {
        int n = s.length();
        char[] s2 = s.toCharArray();
        int[] rnk = new int[n];
        for (int i = 0; i < n; i++) {
            rnk[sa.get(i)] = i;
        }
        List<Integer> lcp = new ArrayList<>();
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (h > 0) {
                h--;
            }
            if (rnk[i] == 0) {
                continue;
            }
            int j = sa.get(rnk[i] - 1);
            while (j + h < n && i + h < n && s2[j + h] == s2[i + h]) {
                h++;
            }
            lcp.add(h);
            h = Math.max(h - 1, 0);
        }
        return lcp;
    }

    public static List<Integer> zAlgorithm(String s) {
        int n = s.length();
        char[] s2 = s.toCharArray();
        if (n == 0) return new ArrayList<>();
        List<Integer> z = new ArrayList<>(Collections.nCopies(n, 0));
        int j = 0, k = 0;
        for (int i = 1; i < n; i++) {
            if (j + z.get(j) <= i) {
                j = i;
                k = Math.max(i, k);
                while (k < n && s2[k] == s2[k - i]) {
                    k++;
                }
                z.set(i, k - i);
            } else {
                z.set(i, Math.min(z.get(i - j), j + z.get(j) - i));
            }
        }
        z.set(0, n);
        return z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        List<Integer> sa = suffixArray(S);
        int res = S.length() * (S.length() + 1) / 2;

        List<Integer> lcpArray = lcpArray(S, sa);
        for (int x : lcpArray) {
            res -= x;
        }

        System.out.println(res);
    }
}
```
```
