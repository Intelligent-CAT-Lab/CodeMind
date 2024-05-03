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
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        String s = "9".repeat(n);
        if (c < 0) {
            return (n > 1) ? 11 : Integer.parseInt(s + s);
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1) {
                for (int m = (int) Math.pow(10, -n + 1); m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((sum(h + mStr) * 2 + c) % 3 != 0) {
                        String t = h + mStr.substring(0, n - 1);
                        int a = Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString());
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
        for (char c :