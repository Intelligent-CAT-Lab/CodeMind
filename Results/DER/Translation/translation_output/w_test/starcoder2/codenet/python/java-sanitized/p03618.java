import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s_arr = s.toCharArray();
        Arrays.sort(s_arr);
        String s_sorted = new String(s_arr);
        int l = s_sorted.length();
        int res = l * (l - 1) / 2 + 1;
        int i = 0;
        while (i < l) {
            int j = i + 1;
            while (j < l && s_sorted.charAt(j) == s_sorted.charAt(i)) {
                j++;
            }
            int p = j - i;
            res -= p * (p - 1) / 2;
            i = j;
        }
        System.out.println(res);
    }
}