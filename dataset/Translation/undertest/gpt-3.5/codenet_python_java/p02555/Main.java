import java.util.Scanner;

public class p02555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        int mod = (int) (Math.pow(10, 9) + 7);
        int[] fact = new int[2 * s + 1];
        int[] inv = new int[2 * s + 1];
        
        for (int i = 0; i < 2 * s + 1; i++) {
            fact[i] = 1;
            inv[i] = 1;
        }
        
        for (int i = 2; i < 2 * s + 1; i++) {
            fact[i] = (int) ((long) i * fact[i - 1] % mod);
        }
        
        inv[2 * s] = pow(fact[2 * s], -1, mod);
        for (int i = 2 * s; i > 1; i--) {
            inv[i - 1] = (int) ((long) inv[i] * i % mod);
        }
        
        int ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (int) ((ans + comb(s - 3 * i + i - 1, i - 1, fact, inv, mod)) % mod);
        }
        
        System.out.println(ans);
    }
    
    public static int pow(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (int) ((long) result * base % mod);
            }
            
            exp = exp >> 1;
            base = (int) ((long) base * base % mod);
        }
        
        return result;
    }
    
    public static int comb(int x, int y, int[] fact, int[] inv, int mod) {
        if (x >= y && y >= 0) {
            return (int) ((long) fact[x] * inv[y] % mod * inv[x - y] % mod);
        } else {
            return 0;
        }
    }
}