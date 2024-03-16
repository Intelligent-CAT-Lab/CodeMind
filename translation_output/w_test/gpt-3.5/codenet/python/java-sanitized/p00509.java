import java.util.Scanner;

public class p00509 {
    
    public static boolean isPrime(int x) {
        for (int i = 7; i <= Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int f(int n, int c) {
        String s = "9".repeat(n);
        if (c < 0) {
            return n > 1 ? Integer.parseInt("11" + s + new StringBuilder(s).reverse().toString()) : 11;
        }
        
        for (char h : "9731".toCharArray()) {
            if (n > 1) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if (((int) (h - '0' + Integer.parseInt(mStr)) * 2 + c) % 3 != 0) {
                        String t = h + mStr;
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (isPrime(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + c + h);
                if (isPrime(a)) {
                    return a;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        
        int result = f(n, c);
        System.out.println(result);
    }
}