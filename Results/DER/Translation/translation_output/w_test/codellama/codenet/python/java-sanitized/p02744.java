import java.util.Scanner;

public class p02744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = main(n);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static String[] main(int n) {
        if (n == 1) {
            return new String[]{"a"};
        } else {
            String[] ans = new String[0];
            for (String k : main(n - 1)) {
                ans = f(k);
            }
            return ans;
        }
    }

    public static String[] f(String s) {
        int m = (int) s.charAt(s.length() - 1) - 97;
        String[] res = new String[m + 2];
        for (int i = 0; i < m + 2; i++) {
            res[i] = s + (char) (i + 97);
        }
        return res;
    }
}