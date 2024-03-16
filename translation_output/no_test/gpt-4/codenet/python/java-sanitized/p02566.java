import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p02566 {

    // Suffix array construction algorithm using the naive approach
    static int[] sa_naive(String s) {
        int n = s.length();
        Integer[] sa = new Integer[n];
        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }
        Arrays.sort(sa, Comparator.comparingInt(i -> s.substring(i).hashCode()));
        return Arrays.stream(sa).mapToInt(Integer::intValue).toArray();
    }

    // Suffix array construction algorithm using the doubling approach
    static int[] sa_doubling(String s) {
        int n = s.length();
        Integer[] sa = new Integer[n];
        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }
        int[] rnk = s.chars().toArray();
        int[] tmp = new int[n];
        int k = 1;
        while (k < n) {
            int finalK = k;
            Arrays.sort(sa, (x, y) -> {
                if (rnk[x] != rnk[y]) return rnk[x] - rnk[y];
                int rx = x + finalK < n ? rnk[x + finalK] : -1;
                int ry = y + finalK < n ? rnk[y + finalK] : -1;
                return rx - ry;
            });
            tmp[sa[0]] = 0;
            for (int i = 1; i < n; i++) {
                tmp[sa[i]] = tmp[sa[i - 1]];
                int prevRank = sa[i - 1] + k < n ? rnk[sa[i - 1] + k] : -1;
                int currRank = sa[i] + k < n ? rnk[sa[i] + k] : -1;
                if (rnk[sa[i]] != rnk[sa[i - 1]] || prevRank != currRank) {
                    tmp[sa[i]]++;
                }
            }
            k *= 2;
            int[] temp = tmp;
            tmp = rnk;
            rnk = temp;
        }
        return Arrays.stream(sa).mapToInt(Integer::intValue).toArray();
    }

    // Implementation of SA-IS suffix array construction algorithm
    static int[] sa_is(String s, int upper) {
        // This method would be too complex and verbose to translate directly in its full extent.
        //