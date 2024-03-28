import java.util.*;
public class p00509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        String s = "9" + "9" * (n - 1);
        if (c < 0) {
            System.out.println((n > 1)? 11 : 1);
            return;
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1 > 0) {
                for (int m = (int) Math.pow(10, n - 1); m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((h + mStr).chars().map(Character::getNumericValue).sum() * 2 + c) % 3 == 0) {
                        String t = h + mStr.replaceAll("^0+", "");
                        int a = Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString());
                        if (isPrime(a)) {
                            System.out.println(a);
                            return;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + String.valueOf(c) + h);
                if (isPrime(a)) {
                    System.out.println(a);
                    return;
                }
            }
        }
        System.out.println(0);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}