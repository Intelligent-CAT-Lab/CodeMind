import java.util.Scanner;

public class p02331 {
    
    private static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        System.out.println(powMod(k, n, MOD));
        
        scanner.close();
    }
    
    private static long powMod(int base, int exponent, int mod) {
        long result = 1;
        long b = base;
        
        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                result = (result * b) % mod;
            }
            exponent >>= 1;
            b = (b * b) % mod;
        }

        return result;
    }
}