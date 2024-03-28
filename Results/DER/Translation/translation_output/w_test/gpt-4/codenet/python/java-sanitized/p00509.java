import java.util.Scanner;

public class p00509 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        in.close();
        System.out.println(f(n, c));
    }

    public static boolean isPrime(int x) {
        for (int i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static int f(int n, int c) {
        String s = "9".repeat(n);
        if (c < 0) return n > 1 ? Integer.parseInt(s + s) : 11;

        int a;
        for (char h : new char[]{'9', '7', '3', '1'}) {
            if (n - 1 > 0) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m > 0; m--) {
                    String mStr = Integer.toString(m - 1);
                    int sum = 0;
                    for (char k : (h + mStr).toCharArray()) {
                        sum += Character.getNumericValue(k);
                    }
                    sum *= 2;
                    sum += c;

                    if (sum % 3 != 0) {
                        String t = h + String.format("%0" + (n - 1) + "d", m - 1);
                        a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (isPrime(a)) return a;
                    }
                }
            } else {
                a = Integer.parseInt(h + "" + c + h);
                if (isPrime(a)) return a;
            }
        }
        return -1;
    }
}