import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long mod = (long) Math.pow(10,9) + 7;
        System.out.println(pow(m, n, mod));
    }

    public static long pow(long a, long b, long m) {
        long result = 1;
        a = a % m;
        while (b > 0) {
            if ((b & 1) == 1)
                result = (result * a) % m;
            b = b >> 1;
            a = (a * a) % m;
        }
        return result;
    }
}