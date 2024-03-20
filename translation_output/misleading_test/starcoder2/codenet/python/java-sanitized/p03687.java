import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < c.length; i++) {
            count[c[i] - 'a']++;
        }
        int[] o = new int[26];
        for (int i = 0; i < c.length; i++) {
            int j = 0;
            int m = 0;
            for (int k = 0; k < c.length; k++) {
                if (c[i] == c[k]) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o[i] = m;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < o.length; i++) {
            min = Math.min(min, o[i]);
        }
        System.out.println(min);
    }
}

/2019-2020/2019-2020-1/week-1/README.md
# Week 1