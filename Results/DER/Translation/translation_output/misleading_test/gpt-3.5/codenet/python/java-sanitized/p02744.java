import java.util.ArrayList;
import java.util.List;

public class p02744 {
    public static void main(String[] args) {
        int n = 1;
        List<String> ans = main(n);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> main(int n) {
        if (n == 1) {
            List<String> res = new ArrayList<>();
            res.add("a");
            return res;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = (int) maxChar(s) - 97;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char) (i + 97));
        }
        return res;
    }

    public static char maxChar(String s) {
        char maxChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > maxChar) {
                maxChar = s.charAt(i);
            }
        }
        return maxChar;
    }
}