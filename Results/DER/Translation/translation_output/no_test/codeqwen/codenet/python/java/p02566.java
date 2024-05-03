```java
import java.util.*;

public class Main {
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

    public static int[] saNaive(String s) {
        int n = s.length();
        int[] sa = new int[n];
        for (int i = 0; i < n; i++) {
            sa[i] = i;
        }
        Arrays.sort(sa, Comparator.comparing(i -> s.substring(i)));
        return sa;
    }

    public static int[] saDoubling(String s) {
        int n = s.length();
        int[] sa = new int[n];
        int[] rnk = new int[n];
        int[] tmp = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            rnk[i] = s.charAt(i);
        }
        while (k < n) {
            Arrays.sort(sa, Comparator.comparingInt(i -> rnk[i]));
            tmp[sa[0]] = 0;
            for (int i = 1; i < n; i++) {
                tmp[sa[i]] = tmp[sa[i - 1]];
                if (rnk[sa[i - 1]] != rnk[sa[i]]) {
                    tmp[sa[i]]++;
                }
                if (sa[i - 1] + k < n && sa[i] + k < n) {
                    if (rnk[sa[i - 1] + k] != rnk[sa[i] + k]) {
                        tmp[sa
