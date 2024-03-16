import java.util.*;
public class p00509 {
    public static int p(int x) {
        for (int i = 7; i <= Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int f() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        String s = "9" + "9".repeat(n - 1);
        if (c < 0) {
            return (11, s + s)[n > 1]? 1 : 0;
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1 > 0) {
                for (int m = (int) Math.pow(10, n - 1); m >= 1; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((h + mStr).chars().map(Character::getNumericValue).sum() * 2 + c) % 3 == 0) {
                        String t = h + mStr.replaceAll("^0+", "");
                        int a = Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString());
                        if (p(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(String.valueOf(h) + String.valueOf(c) + String.valueOf(h));
                if (p(a)) {
                    return a;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}