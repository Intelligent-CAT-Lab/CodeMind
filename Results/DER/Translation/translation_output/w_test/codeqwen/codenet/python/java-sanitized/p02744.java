import java.util.*;

public class p02744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = main(n);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> main(int n) {
        if (n == 1) {
            return Arrays.asList("a");
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = (int) s.chars().max().getAsInt() - 96;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char) (i + 97));
        }
        return res;
    }
}