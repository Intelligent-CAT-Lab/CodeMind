import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        int[] o = new int[26];
        for (int i = 0; i < 26; i++) {
            int j = 0;
            int m = 0;
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) - 'a' == i) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o[i] = m;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (c[i] > 0) {
                min = Math.min(min, o[i]);
            }
        }
        System.out.println(min);
    }
}