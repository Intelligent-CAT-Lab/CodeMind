import java.util.*;

public class p02744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = main(n);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static List<String> f(String s) {
        int m = s.charAt(0) - 'a';
        List<String> res = new ArrayList<>(Collections.nCopies(m + 2, ""));
        for (int i = 0; i < m + 2; i++) {
            res.set(i, res.get(i) + (char) (i + 'a'));
        }
        return res;
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
}