import java.util.Scanner;

public class p00509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = new String(new char[n]).replace("\0", "9");
        if (c < 0) {
            System.out.println((n > 1) ? "11" + s + s : "11");
            return;
        }
        String h = "9731";
        if (n > 1) {
            for (int i = 0; i < 4; i++) {
                for (int m = (int) Math.pow(10, n - 1) - 1; m >= 0; m--) {
                    String strM = String.valueOf(m);
                    if ((Integer.parseInt(h.charAt(i) + strM) * 2 + c) % 3 != 0) {
                        String t = h.charAt(i) + strM.replace("0", "");
                        if (isPrime(Integer.parseInt(t + String.valueOf(c) + new StringBuilder(t).reverse().toString()))) {
                            System.out.println(t + String.valueOf(c) + new StringBuilder(t).reverse().toString());
                            return;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (isPrime(Integer.parseInt(h.charAt(i) + String.valueOf(c) + h.charAt(i)))) {
                    System.out.println(h.charAt(i) + String.valueOf(c) + h.charAt(i));
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