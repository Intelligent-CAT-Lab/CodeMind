import java.util.*;

public class p02744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = new ArrayList<>();
        if (n == 1) {
            ans.add("a");
        } else {
            List<String> prev = main(n - 1);
            for (String s : prev) {
                ans.addAll(f(s));
            }
        }
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static List<String> f(String s) {
        int m = s.chars().max().orElse(0) - 97;
        List<String> res = new ArrayList<>(m + 2);
        for (int i = 0; i <= m + 1; i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.append(chr(i + 97));
            res.add(sb.toString());
        }
        return res;
    }

    public static char chr(int i) {
        return (char) (i + 97);
    }

    public static List<String> main(int n) {
        if (n == 1) {
            return Arrays.asList("a");
        } else {
            List<String> prev = main(n - 1);
            List<String> ans = new ArrayList<>();
            for (String s : prev) {
                ans.addAll(f(s));
            }
            return ans;
        }
    }
}