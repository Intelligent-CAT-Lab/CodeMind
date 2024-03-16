import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = main(n);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> f(String s) {
        char maxChar = 'a';
        for (char c : s.toCharArray()) {
            if (c > maxChar) {
                maxChar = c;
            }
        }
        int m = maxChar - 'a';
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= m + 1; i++) {
            res.add(s + (char) (i + 'a'));
        }
        return res;
    }

    public static List<String> main(int n) {
        if (n == 1) {
            List<String> ans = new ArrayList<>();
            ans.add("a");
            return ans;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }
}