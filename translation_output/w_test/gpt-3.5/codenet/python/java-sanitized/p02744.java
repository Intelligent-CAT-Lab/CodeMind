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
            List<String> result = new ArrayList<>();
            result.add("a");
            return result;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = (int) s.chars().max().orElse(97) - 97;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.append((char) (i + 97));
            res.add(sb.toString());
        }
        return res;
    }
}