import java.util.Scanner;

public class p00509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            System.out.println((n > 1 ? "11" : "1") + s + s);
            return;
        }
        for (char h : "9731".toCharArray()) {
            if (n > 1) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m >= 0; m--) {
                    String strM = String.valueOf(m);
                    if ((Integer.parseInt(h + strM) * 2 + c) % 3 != 0) {
                        String t = h + strM.substring(1);
                        if (isPrime(Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString()))) {
                            System.out.println(t + strM + c + new StringBuilder(t).reverse().toString());
                            return;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(String.valueOf(h) + c + h);
                if (isPrime(a)) {
                    System.out.println(a);
                    return;
                }
            }
        }
    }

    private static boolean isPrime(int x) {
        for (int i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}