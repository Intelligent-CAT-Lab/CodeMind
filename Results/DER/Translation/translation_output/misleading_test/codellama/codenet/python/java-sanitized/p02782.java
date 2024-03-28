import java.util.Scanner;

public class p02782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int mod = 1000000007;
        int rng = 2000100;
        int[] fctr = new int[rng];
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
        int finv = pow(fctr[x2 + y2 + 2], mod - 2, mod) * pow(fctr[x2 + y1 + 1], mod - 2, mod) * pow(fctr[x1 + y2 + 1], mod - 2, mod) * pow(fctr[x1 + y1], mod - 2, mod) % mod;
        int cmb = (fctr[x2 + y2 + 2] * finv(x2 + y1 + 1) * finv(x1 + y2 + 1) * finv(x1 + y1)) % mod;
        System.out.println(cmb);
    }
}