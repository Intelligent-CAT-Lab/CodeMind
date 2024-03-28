import java.util.Arrays;

public class p02566 {

    public static int[] saNaive(String s) {
        int n = s.length();
        int[] sa = new int[n];
        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }
        Arrays.sort(sa, (x, y) -> s.substring(x).compareTo(s.substring(y)));
        return sa;
    }

    public static int[] saDoubling(String s) {
        int n = s.length();
        int[] sa = new int[n];
        int[] rnk = new int[n];
        int[] tmp = new int[n];
        int k = 1;
        while (k < n) {
            Arrays.sort(sa, (x, y) -> {
                int cmp1 = rnk[x] - rnk[y];
                int cmp2 = (x + k < n ? rnk[x + k] : -1) - (y + k < n ? rnk[y + k] : -1);
                return cmp1 != 0 ? cmp1 : cmp2;
            });
            tmp[sa[0]] = 0;
            for (int i = 1; i < n; i++) {
                tmp[sa[i]] = tmp[sa[i - 1]];
                int x = (sa[i - 1] + k < n ? rnk[sa[i - 1] + k] : -1);
                int y = (sa[i] + k < n ? rnk[sa[i] + k] : -1);
                if (rnk[sa[i - 1]] < rnk[sa[i]] || (rnk[sa[i - 1]] == rnk[sa[i]] && x < y)) {
                    tmp[sa[i]]++;
                }
            }
            k *= 2;
            tmp = Arrays.copyOf(rnk, n);
            rnk = Arrays.copyOf(tmp, n);
        }
        return sa;
    }

    public static int[] saIs(String s, int upper) {
        int n = s.length();
        if (n == 0) return new int[0];
        if (n == 1) return new int[]{0};
        if (n == 2) {
            return s.charAt(0) < s.charAt(1) ? new int[]{0, 1} : new int[]{1, 0};
        }
        if (n < 10) {
            return saNaive(s);
        }
        if (n < 50) {
            return saDoubling(s);
        }
        int[] ls = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            ls[i] = (s.charAt(i) == s.charAt(i + 1)) ? ls[i + 1] : s.charAt(i) < s.charAt(i + 1) ? 1 : 0;
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
        int[] lms = new int[m];
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (ls[i - 1] == 0 && ls[i] == 1) {
                lms[idx++] = i;
            }
        }
        int[] sa = new int[n];
        int[] buf = Arrays.copyOf(sumS, upper + 1);
        for (int d : lms) {
            if (d == n) continue;
            sa[buf[s.charAt(d)]++] = d;
        }
        buf = Arrays.copyOf(sumL, upper + 1);
        sa[buf[s.charAt(n - 1)]++] = n - 1;
        for (int i = 0; i < n; i++) {
            int v = sa[i];
            if (v >= 1 && ls[v - 1] == 0) {
                sa[buf[s.charAt(v - 1)]++] = v - 1;
            }
        }
        buf = Arrays.copyOf(sumL, upper + 1);
        for (int i = n - 1; i >= 0; i--) {
            int v = sa[i];
            if (v >= 1 && ls[v - 1] == 1) {
                buf[s.charAt(v - 1) + 1]--;
                sa[buf[s.charAt(v - 1) + 1]] = v - 1;
            }
        }
        if (m > 0) {
            int[] sortedLms = new int[m];
            int idxLms = 0;
            for (int v : sa) {
                if (lmsMap[v] != -1) {
                    sortedLms[idxLms++] = v;
                }
            }
            int[] recS = new int[m];
            int recUpper = 0;
            recS[lmsMap[sortedLms[0]]] = 0;
            for (int i = 1; i < m; i++) {
                int l = sortedLms[i - 1];
                int r = sortedLms[i];
                int endL = (lmsMap[l] + 1 < m) ? lms[lmsMap[l] + 1] : n;
                int endR = (lmsMap[r] + 1 < m) ? lms[lmsMap[r] + 1] : n;
                boolean same = true;
                if (endL - l != endR - r) {
                    same = false;
                } else {
                    while (l < endL) {
                        if (s.charAt(l) != s.charAt(r)) {
                            same = false;
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
                recS[lmsMap[sortedLms[i]]] = recUpper;
            }
            int[] recSa = saIs(Arrays.toString(recS), recUpper);
            for (int i = 0; i < m; i++) {
                sortedLms[i] = lms[recSa[i]];
            }
            sa = new int[n];
            buf = Arrays.copyOf(sumS, upper + 1);
            for (int d : sortedLms) {
                if (d == n) continue;
                sa[buf[s.charAt(d)]++] = d;
            }
            buf = Arrays.copyOf(sumL, upper + 1);
            sa[buf[s.charAt(n - 1)]++] = n - 1;
            for (int i = 0; i < n; i++) {
                int v = sa[i];
                if (v >= 1 && ls[v - 1] == 0) {
                    sa[buf[s.charAt(v - 1)]++] = v - 1;
                }
            }
            buf = Arrays.copyOf(sumL, upper + 1);
            for (int i = n - 1; i >= 0; i--) {
                int v = sa[i];
                if (v >= 1 && ls[v - 1] == 1) {
                    buf[s.charAt(v - 1) + 1]--;
                    sa[buf[s.charAt(v - 1) + 1]] = v - 1;
                }
            }
        }
        return sa;
    }

    public static int[] suffixArray(String s) {
        int n = s.length();
        int[] s2 = new int[n];
        for (int i = 0; i < n; i++) {
            s2[i] = (int) s.charAt(i);
        }
        return saIs(Arrays.toString(s2), 255);
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
        char[] s2 = s.toCharArray();
        if (n == 0) return new int[0];
        int[] z = new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            z[i] = (j + z[j] <= i) ? 0 : Math.min(j + z[j] - i, z[i - j]);
            while (i + z[i] < n && s2[z[i]] == s2[i + z[i]]) {
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
        String S = "abcbcba";
        int[] sa = suffixArray(S);
        int res = S.length() * (S.length() + 1) / 2;

        int[] lcpArray = lcpArray(S, sa);
        for (int x : lcpArray) {
            res -= x;
        }

        System.out.println(res);
    }
}