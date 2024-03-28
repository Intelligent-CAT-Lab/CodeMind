import java.util.*;
public class p02744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = new String[n];
        ans[0] = "a";
        for (int i = 1; i < n; i++) {
            String s = ans[i - 1];
            int m = s.charAt(0) - 'a';
            String[] res = new String[m + 2];
            for (int j = 0; j < m + 2; j++) {
                res[j] = s + (char) ('a' + j);
            }
            ans[i] = res[m + 1];
        }
        for (String s : ans) {
            System.out.println(s);
        }
    }
}