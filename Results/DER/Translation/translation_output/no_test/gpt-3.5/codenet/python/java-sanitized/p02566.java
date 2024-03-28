import java.util.*;

class SuffixArray {

    public static List<Integer> saNaive(String s) {
        int n = s.length();
        List<Integer> sa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sa.add(i);
        }
        sa.sort((x, y) -> s.substring(x).compareTo(s.substring(y)));
        return sa;
    }

    public static List<Integer> saDoubling(String s) {
        int n = s.length();
        List<Integer> sa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sa.add(i);
        }
        int[] rnk = new int[n];
        int[] tmp = new int[n];
        int k = 1;
        while (k < n) {
            sa.sort((x, y) -> {
                int xk = (x + k < n) ? rnk[x + k] : -1;
                int yk = (y + k < n) ? rnk[y + k] : -1;
                if (rnk[x] == rnk[y]) {
                    return Integer.compare(xk, yk);
                } else {
                    return Integer.compare(rnk[x], rnk[y]);
                }
            });
            tmp[sa.get(0)] = 0;
            for (int i = 1; i < n; i++) {
                int x = (sa.get(i - 1) + k < n) ? rnk[sa.get(i - 1) + k] : -1;
                int y = (sa.get(i) + k < n) ? rnk[sa.get(i) + k] : -1;
                tmp[sa.get(i)] = tmp[sa.get(i - 1)] + ((rnk[sa.get(i - 1)] == rnk[sa.get(i) && x == y) ? 0 : 1);
            }
            k *= 2;
            tmp = rnk.clone();
        }
        return sa;
    }

    public static List<Integer> saIs(String s, int upper) {
        int n = s.length();
        if (n == 0) return new ArrayList<>();
        if (n == 1) return List.of(0);
        if (n == 2) {
            if (s.charAt(0) < s.charAt(1)) {
                return List.of(0, 1);
            } else {
                return List.of(1, 0);
            }
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
        for (int i = 0; i <= upper; i++) {
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
        if (m > 0) {
            List<Integer> sortedLms = new ArrayList<>();
            for (int v : sa) {
                if (lmsMap[v] != -1) sortedLms.add(v);
            }
            int[] recS = new int[m];
            int recUpper = 0;
            recS[lmsMap[sortedLms.get(0)] - 1] = 0;
            for (int i = 1; i < m; i++) {
                int l = sortedLms.get(i - 1);
                int r = sortedLms.get(i);
                int endL = (lmsMap[l] + 1 < m) ? lms.get(lmsMap[l] + 1) : n;
                int endR = (lmsMap[r] + 1 < m) ? lms.get(lmsMap[r] + 1) : n;
                boolean same = true;
                if (endL - l != endR - r) {
                    same = false;
                } else {
                    while (l < endL) {
                        if (s.charAt(l) != s.charAt(r)) {
                            break;
                        }
                        l++;
                        r++;
                    }
                    if (l == n || s.charAt(l) != s.charAt(r)) {
                        same = false;
                    }
                }
                if (!same) {
                    recUpper++;
                }
                recS[lmsMap[sortedLms.get(i)] - 1] = recUpper;
            }
            int[] recSa = saIs(Arrays.toString(recS), recUpper).stream().mapToInt(i->i).toArray();
            for (int i = 0; i < m; i++) {
                sortedLms.set(i, lms.get(recSa[i]));
            }
            sa.clear();
            buf = sumS.clone();
            for (int d : sortedLms) {
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
        }
        return sa;
    }
}

public class p02566 {

    public static int[] suffixArray(String s) {
        int n = s.length();
        int[] s2 = new int[n];
        for (int i = 0; i < n; i++) {
            s2[i] = s.charAt(i);
        }
        return SuffixArray.saIs(Arrays.toString(s2), 255).stream().mapToInt(i -> i).toArray();
    }

    public static int[] lcpArray(String s, int[] sa) {
        int n = s.length();
        int[] rnk = new int[n];
        for (int i = 0; i < n; i++) {
            rnk[sa[i]] = i;
        }
        int[] lcp = new int[n - 1];
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (h > 0) {
                h--;
            }
            if (rnk[i] == 0) {
                continue;
            }
            int j = sa[rnk[i] - 1];
            while (j + h < n && i + h < n) {
                if (s.charAt(j + h) != s.charAt(i + h)) {
                    break;
                }
                h++;
            }
            lcp[rnk[i] - 1] = h;
        }
        return lcp;
    }

    public static int[] zAlgorithm(String s) {
        int n = s.length();
        int[] s2 = new int[n];
        for (int i = 0; i < n; i++) {
            s2[i] = s.charAt(i);
        }
        if (n == 0) return new int[0];
        int[] z = new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            z[i] = (j + z[j] <= i) ? Math.min(j + z[j] - i, z[i - j]) : 0;
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
                if (j + z[j] < i + z[i]) {
                    j = i;
                }
            }
        }
        z[0] = n;
        return z;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int[] sa = suffixArray(S);
        int res = S.length() * (S.length() + 1) / 2;

        for (int x : lcpArray(S, sa)) {
            res -= x;
        }
        System.out.println(res);
    }
}