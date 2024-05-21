import java.util.*;

public class p02744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = main(n);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static List<String> main(int n) {
        if (n == 1) {
            return Arrays.asList("a");
        } else {
            List<String> ans = new ArrayList<>();
            List<String> prev = main(n - 1);
            for (String s : prev) {
                List<String> next = f(s);
                ans.addAll(next);
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = s.chars().max().getAsInt() - 'a';
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= m + 1; i++) {
            res.add(s);
        }
        for (int i = 0; i <= m + 1; i++) {
            res.set(i, res.get(i) + (char) (i + 'a'));
        }
        return res;
    }
}