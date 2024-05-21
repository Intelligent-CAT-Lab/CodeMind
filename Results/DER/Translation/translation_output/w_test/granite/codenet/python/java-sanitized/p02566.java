import java.util.Arrays;

public class p02566 {
    public static void main(String[] args) {
        String S = "abcbcba";
        int[] sa = suffixArray(S);
        int[] lcp = lcpArray(S, sa);
        int res = S.length() * (S.length() + 1) / 2;
        for (int x : lcp) {
            res -= x;
        }
        System.out.println(res);
    }

    public static int[] suffixArray(String s) {
        int n = s.length();
        int[] s2 = new int[n];
        for (int i = 0; i < n; i++) {
            s2[i] = (int) s.charAt(i);
        }
        return saIs(s2, 255);
    }

    public static int[] lcpArray(String s, int[] sa) {
        int n = s.length();
        int[] s2 = new int[n];
        for (int i = 0; i < n; i++) {
            s2[i] = (int) s.charAt(i);
        }
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
                if (s2[j + h]!= s2[i + h]) {
                    break;
                }
                h++;
            }
            lcp[rnk[i] - 1] = h;
        }
        return lcp;
    }

    public static int[] saIs(int[] s, int upper) {
        int n = s.length;
        if (n == 0) {
            return new int[0];
        }
        if (n == 1) {
            return new int[]{0};
        }
        if (n == 2) {
            if (s[0] < s[1]) {
                return new int[]{0, 1};
            } else {
                return new int[]{1, 0};
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
            ls[i] = ls[i + 1] == 0? s[i] > s[i + 1]? 1 : 0 : ls[i + 1];
        }
        int[] sumL = new int[upper + 1];
        int[] sumS = new int[upper + 1];
        for (int i = 0; i < n; i++) {
            if (ls[i] == 1) {
                sumL[s[i] + 1]++;
            } else {
                sumS[s[i]]++;
            }
        }
        for (int i = 0; i < upper; i++) {
            sumS[i] += sumL[i];
            if (i < upper) {
                sumL[i + 1] += sumS[i];
            }
        }
        int[] lmsMap = new int[n + 1];
        Arrays.fill(lmsMap, -1);
        int m = 0;
        for (int i = 1; i < n; i++) {
            if (ls[i - 1] == 0 && ls[i] == 1) {
                lmsMap[i] = m++;
            }
        }
        int[] lms = new int[m];
        m = 0;
        for (int i = 1; i < n; i++) {
            if (ls[i - 1] == 0 && ls[i] == 1) {
                lms[m++] = i;
            }
        }
        int[] sa = new int[n];
        int[] buf = sumS.clone();
        for (int d : lms) {
            if (d == n) {
                continue;
            }
            sa[buf[s[d]]++] = d;
        }
        buf = sumL.clone();
        sa[buf[s[n - 1]]++] = n - 1;
        for (int i = 0; i < n; i++) {
            int v = sa[i];
            if (v >= 1 && ls[v - 1] == 0) {
                sa[buf[s[v - 1]]++] = v - 1;
            }
        }
        buf = sumL.clone();
        for (int i = n - 1; i >= 0; i--) {
            int v = sa[i];
            if (v >= 1 && ls[v - 1] == 1) {
                buf[s[v - 1] + 1]--;
                sa[buf[s[v - 1] + 1]] = v - 1;
            }
        }
        if (m > 0) {
            int[] sortedLms = new int[m];
            for (int v : sa) {
                if (lmsMap[v]!= -1) {
                    sortedLms[lmsMap[v]] = v;
                }
            }
            int[] recS = new int[m];
            int recUpper = 0;
            recS[lmsMap[sortedLms[0]]] = 0;
            for (int i = 1; i < m; i++) {
                int l = sortedLms[i - 1];
                int r = sortedLms[i];
                int endL = lmsMap[l] + 1 < m? lms[lmsMap[l] + 1] : n;
                int endR = lmsMap[r] + 1 < m? lms[lmsMap[r] + 1] : n;
                boolean same = true;
                if (endL - l!= endR - r) {
                    same = false;
                } else {
                    while (l < endL) {
                        if (s[l]!= s[r]) {
                            break;
                        }
                        l++;
                        r++;
                    }
                    if (l == n || s[l]!= s[r]) {
                        same = false;
                    }
                }
                if (!same) {
                    recUpper++;
                }
                recS[lmsMap[sortedLms[i]]] = recUpper;
            }
            int[] recSa = saIs(recS, recUpper);
            for (int i = 0; i < m; i++) {
                sortedLms[i] = lms[recSa[i]];
            }
            sa = new int[n];
            buf = sumS.clone();
            for (int d : sortedLms) {
                if (d == n) {
                    continue;
                }
                sa[buf[s[d]]++] = d;
            }
            buf = sumL.clone();
            sa[buf[s[n - 1]]++] = n - 1;
            for (int i = 0; i < n; i++) {
                int v = sa[i];
                if (v >= 1 && ls[v - 1] == 0) {
                    sa[buf[s[v - 1]]++] = v - 1;
                }
            }
            buf = sumL.clone();
            for (int i = n - 1; i >= 0; i--) {
                int v = sa[i];
                if (v >= 1 && ls[v - 1] == 1) {
                    buf[s[v - 1] + 1]--;
                    sa[buf[s[v - 1] + 1]] = v - 1;
                }
            }
        }
        return sa;
    }

    public static int[] saNaive(int[] s) {
        int n = s.length;
        int[] sa = new int[n];
        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }
        Arrays.sort(sa, (i, j) -> {
            while (i < n && j < n) {
                if (s[i]!= s[j]) {
                    return s[i] - s[j];
                }
                i++;
                j++;
            }
            return i - j;
        });
        return sa;
    }

    public static int[] saDoubling(int[] s) {
        int n = s.length;
        int[] sa = new int[n];
        int[] rnk = s.clone();
        int[] tmp = new int[n];
        for (int k = 1; k