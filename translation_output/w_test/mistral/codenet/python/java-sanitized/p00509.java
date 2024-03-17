import java.util.*;

public class p00509 {
    public static int f() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return (11, s + s)[n > 1];
        }
        for (String h : new String[]{"9731"}) {
            if (n - 1) {
                for (int m = 1000000000000 - (int) Math.pow(10, n); m >= 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    int sum = 0;
                    for (char k : h.toCharArray()) {
                        sum += (k - '0') * Math.pow(10, n - mStr.length());
                    }
                    if ((sum + c) % 3 == 0) {
                        String t = h + mStr.zfill(n - 1);
                        int a = Integer.parseInt(t + String.valueOf(c) + t.substring(0, n - 1));
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

    public static int p(int x) {
        for (int i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 1;
        int c = 0;
        System.out.println(f());
    }
}