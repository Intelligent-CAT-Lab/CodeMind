import java.util.Scanner;

public class p00509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            System.out.println((n > 1) ? "11" + s + s : "11");
        } else {
            for (char h : "9731".toCharArray()) {
                if (n > 1) {
                    for (int m = (int) Math.pow(10, n - 1); m > 0; m--) {
                        String mStr = String.valueOf(m - 1);
                        if ((sumDigits(h + mStr) + c) % 3 != 0) {
                            String t = h + mStr.substring(1) + c;
                            int a = Integer.parseInt(t + new StringBuilder(t).reverse().toString());
                            if (isPrime(a)) {
                                System.out.println(a);
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
    }

    private static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}