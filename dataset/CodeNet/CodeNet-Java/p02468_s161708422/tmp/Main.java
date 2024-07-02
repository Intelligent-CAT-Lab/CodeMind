
import java.util.Scanner;

public class Main {

    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.next());
System.out.println("[INST]9;m;Integer.parseInt(scan.next());"+m);
System.out.println("[INST]9;None;scan.next();"+scan.next());
        int n = Integer.parseInt(scan.next());
System.out.println("[INST]10;n;Integer.parseInt(scan.next());"+n);
System.out.println("[INST]10;None;scan.next();"+scan.next());
        scan.close();

        System.out.println(modPow(m, n));
    }

    private static long modPow(long m, long n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return modPow(m * m % mod, n / 2);
        } else {
            return modPow(m * m % mod, (n - 1) / 2) * m % mod;
        }
    }

}

