import java.util.*;

public class p02744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    public static List<String> f(int n) {
        if (n == 1) {
            List<String> ans = new ArrayList<>();
            ans.add("a");
            return ans;
        } else {
            List<String> ans = new ArrayList<>();
            List<String> prev = f(n - 1);
            for (String s : prev) {
                int m = s.charAt(s.length() - 1) - 'a';
                for (int i = 0; i < m + 2; i++) {
                    ans.add(s + (char) (i + 'a'));
                }
            }
            return ans;
        }
    }
}

/docs/leetcode/0001-0100/0001-0050.md