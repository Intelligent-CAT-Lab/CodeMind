import java.util.*;
public class p00509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            if (n > 1) {
                System.out.println(11);
            } else {
                System.out.println(s + s);
            }
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1 > 0) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m >= 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((sum(h + mStr) * 2 + c) % 3 != 0) {
                        String t = h + mStr.substring(0, n - 1);
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (p(a)) {
                            System.out.println(a);
                            return;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + c + h);
                if (p(a)) {
                    System.out.println(a);
                    return;
                }
            }
        }
    }

    public static boolean p(int x) {
        for (int i = 7; i <= Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}


Upvotes: 0