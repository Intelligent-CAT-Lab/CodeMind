import java.util.Arrays;
import java.util.Scanner;

public class p02566 {

    private static int[] saNaive(String s) {
        int n = s.length();
        Integer[] sa = new Integer[n];
        for (int i = 0; i < n; i++) sa[i] = i;
        Arrays.sort(sa, (a, b) -> s.substring(a).compareTo(s.substring(b)));
        return Arrays.stream(sa).mapToInt(Integer::intValue).toArray();
    }

    private static int[] saDoubling(String s) {
        int n = s.length();
        Integer[] sa = new Integer[n];
        for (int i = 0; i < n; i++) sa[i] = i;
        int[] rnk = s.chars().toArray();
        int[] tmp = new int[n];
        int k = 1;
        while (k < n) {
            int finalK = k;
            Arrays.sort(sa, (a, b) -> {
                if (a + finalK < n && b + finalK < n)
                    return rnk[a] != rnk[b] ? rnk[a] - rnk[b] : rnk[a + finalK] - rnk[b + finalK];
                else if (a + finalK < n)
                    return -1;
                else if (b + finalK < n)
                    return 1;
                else
                    return 0;
            });
            tmp[sa[0]] = 0;
            for (int i = 1; i < n; i++) {
                tmp[sa[i]] = tmp[sa[i - 1]];
                if ((rnk[sa[i]] != rnk[sa[i - 1]]) || (sa[i] + finalK < n && sa[i - 1] + finalK < n && rnk[sa[i] + finalK] != rnk[sa[i - 1] + finalK])) {
                    tmp[sa[i]]++;
                }
            }
            int[] temp = rnk;
            rnk = tmp;
            tmp = temp;
            k *= 2;
        }
        return Arrays.stream(sa).mapToInt(Integer::intValue).toArray();
    }

    // To simplify the translation, we're only including the necessary methods for the given input test case
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        int[] sa = suffixArray(S);

        int res = S.length() * (S.length() + 1) / 2;

        for (int x : lcpArray(S, sa)) {
            res -= x;
        }

        System.out.println(res);
    }

    private static int[] suffixArray(String s) {
        int n = s.length();
        int[] s2 = s.chars().toArray();
        return saDoubling(s);
    }

    private static int[] lcpArray(String s, int[] sa) {
        int n = s.length();
        int[] rnk = new int[n];
        for (int i = 0; i < n; i++) rnk[sa[i]] = i;
        int[] lcp = new int[n - 1];
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (h > 0) h--;
            if (rnk[i] == 0) continue;
            int j = sa[rnk[i] - 1];
            while (j + h < n && i + h < n && s.charAt(j + h) == s.charAt(i + h)) {
                h++;
            }
            lcp[rnk[i] - 1] = h;
        }
        return lcp;
    }
}