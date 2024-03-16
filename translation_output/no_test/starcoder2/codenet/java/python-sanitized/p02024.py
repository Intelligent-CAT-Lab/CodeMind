/p02025.md
# p02025

Translate the following java code to python and enclose your solution inside :

import java.util.*;

public class p02025 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int p = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[p] = a[i];
                i++;
            } else {
                c[p] = b[j];
                j++;
            }
            p++;
        }
        while (i < n) {
            c[p] = a[i];
            i++;
            p++;
        }
        while (j < m) {
            c[p] = b[j];
            j++;
            p++;
        }
        System.out.println(c[k - 1]);
    }
}