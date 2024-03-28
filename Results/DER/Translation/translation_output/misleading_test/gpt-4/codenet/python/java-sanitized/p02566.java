import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p02566 {

    public static int[] saNaive(String s) {
        int n = s.length();
        Integer[] sa = new Integer[n];
        for (int i = 0; i < n; i++) sa[i] = i;
        Arrays.sort(sa, Comparator.comparingInt(i -> s.substring(i)));
        return Arrays.stream(sa).mapToInt(i -> i).toArray();
    }

    public static int[] saDoubling(String s) {
        int n = s.length();
        Integer[] sa = new Integer[n];
        for (int i = 0; i < n; i++) sa[i] = i;
        int[] rnk = s.chars().toArray();
        int[] tmp = new int[n];
        for (int k = 1; k < n; k *= 2) {
            final int kFinal = k;
            Comparator<Integer> comp = (i, j) -> {
                if (rnk[i] != rnk[j]) return Integer.compare(rnk[i], rnk[j]);
                int ri = i + kFinal < n ? rnk[i + kFinal] : -1;
                int rj = j + kFinal < n ? rnk[j + kFinal] : -1;
                return Integer.compare(ri, rj);
            };
            Arrays.sort(sa, comp);
            tmp[sa[0]] = 0;
            for (int i = 1; i < n; i++) {
                tmp[sa[i]] = tmp[sa[i - 1]] + (comp.compare(sa[i - 1], sa[i]) < 0 ? 1 : 0);
            }
            int[] tmp2 = rnk;
            rnk = tmp;
            tmp = tmp2;
        }
        return Arrays.stream(sa).mapToInt(i -> i).toArray();
    }

    // Omitting sa_is and related methods due to complexity and length.
    //