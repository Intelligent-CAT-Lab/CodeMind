import java.util.*;
public class p03999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index++;
            }
            // System.out.println(pat);
            ans += Integer.parseInt(pat);
        }
        System.out.println(ans);
    }
}