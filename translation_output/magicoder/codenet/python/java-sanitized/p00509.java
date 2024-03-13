import java.util.Scanner;

public class p00509 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int p(int x) {
        for (int i = 7; i <= Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return (11 + s + s).substring(n > 1 ? 0 : 1);
        }
        for (char h : "9731".toCharArray()) {
            if (n > 1) {
                for (int m = (int) Math.pow(10, n - 1); m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((sumDigits(h + mStr) * 2 + c) % 3 != 0) {
                        String t = h + mStr.substring(mStr.length() - n + 1);
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (p(a) == 1) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(String.valueOf(h) + c + h);
                if (p(a) == 1) {
                    return a;
                }
            }
        }
        return 0;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}