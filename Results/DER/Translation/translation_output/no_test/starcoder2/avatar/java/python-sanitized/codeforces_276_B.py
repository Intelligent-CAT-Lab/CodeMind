/codeforces/codeforces_276_A.md
# codeforces_276_A

Translate the following java code to python and enclose your solution inside :

import java.util.*;

public class codeforces_276_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = -1000000000;
        for (int i = 0; i < n; i++) {
            int f = in.nextInt();
            int t = in.nextInt();
            if (t >= 0) {
                max = Math.max(max, f);
            } else {
                max = Math.max(max, f - k * t);
            }
        }
        System.out.println(max);
    }
}