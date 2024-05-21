import java.util.*;

public class p02566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int[] sa = sa_is(S.toCharArray(), 255);
        int res = S.length() * (S.length() + 1) / 2;
        for (int x : lcp_array(S, sa)) {
            res -= x;
        }
        System.out.println(res);
    }

    public static int[] sa_naive(char[] s) {
        int n = s.length;
        int[] sa = new int[n];
        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }
        Arrays.sort(sa, Comparator.comparingInt(i -> s[i]));
        return sa;
    }

    public static int[] sa_doubling(char[] s) {
        int n = s.length;
        int[] sa = new int[n];
        int[] rnk = s;
        int[] tmp = new int[n];
        int k = 1;
        while (k < n) {
            Arrays.sort(sa, Comparator.comparingInt(i -> rnk[i]));
            Arrays.fill(tmp, 0);
            for (int i = 1; i < n; i++) {
                tmp[sa[i]] = tmp[sa[i - 1]];
                if (rnk[sa[i]] != rnk[sa[i - 1]] || rnk[sa[i] + k] != rnk[sa[i - 1] + k] && sa[i] + k < n) {
                    tmp[sa[i]]++;
                }
            }
            for (int i = 0; i < n; i++) {
                sa[i] = tmp[sa[i]];
            }
            k *=