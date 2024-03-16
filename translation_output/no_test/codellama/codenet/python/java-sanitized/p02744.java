import java.util.Scanner;

public class p02744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] ans = main(n);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static String[] main(int n) {
        if (n == 1) {
            return new String[] {"a"};
        } else {
            String[] ans = new String[n];
            for (int i = 0; i < n; i++) {
                ans[i] = f(ans[i]);
            }
            return ans;
        }
    }

    public static String f(String s) {
        int m = s.charAt(s.length() - 1) - 'a';
        String[] res = new String[m + 2];
        for (int i = 0; i < m + 2; i++) {
            res[i] = s + (char) (i + 'a');
        }
        return res;
    }
}