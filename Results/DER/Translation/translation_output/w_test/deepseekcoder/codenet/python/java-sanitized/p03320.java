import java.util.Scanner;

public class p03320 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        long a = 0;
        long d = 1;
        for (int i = 1; i <= K; i++) {
            long x = a + d;
            long y = a + 10 * d;
            if (x / snuke(x) <= y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
        scanner.close();
    }

    public static long snuke(long x) {
        long a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }
}