import java.util.Scanner;

public class p02331 {
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        System.out.println(power(k, n, MOD));
    }
    
    private static long power(long base, int exponent, int modulus) {
        long result = 1;
        
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % modulus;
            base = (base * base) % modulus;
            exponent >>= 1;
        }
        
        return result;
    }
}