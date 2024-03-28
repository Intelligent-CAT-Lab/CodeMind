import java.util.*;
import java.math.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        int l = s.length();
        int res = l * (l - 1) / 2 + 1;
        for (int i = 0; i < l;) {
            int j = i;
            while (j < l && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int p = j - i;
            res -= p * (p - 1) / 2;
            i = j;
        }
        System.out.println(res);
    }
}