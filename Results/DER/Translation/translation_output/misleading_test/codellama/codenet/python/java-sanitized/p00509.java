import java.util.Scanner;

public class p00509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return (11, s + s)[n > 1];
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1) {
                for (int m = (int) Math.pow(10, -n); m >= 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((sum(h + mStr) * 2 + c) % 3) {
                        String t = h + mStr.substring(0, n - 1);
                        int a = Integer.parseInt(t + String.valueOf(c) + t.substring(t.length() - 1));
                        if (p(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + String.valueOf(c) + h);
                if (p(a)) {
                    return a;
                }
            }
        }
        return -1;
    }

    public static int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    public static boolean p(int x) {
        for (int i = 7; i <= (int) Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}