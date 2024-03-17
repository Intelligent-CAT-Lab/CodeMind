import java.util.Scanner;

public class p02468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long mod = (long) Math.pow(10,9) + 7;
        System.out.println(pow(m,n,mod));
    }

    public static long pow(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b = b / 2;
        }
        return res;
    }
}