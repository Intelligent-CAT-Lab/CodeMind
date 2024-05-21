import java.util.Scanner;

public class p03083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int W = scanner.nextInt();
        int mod = (int)1e9 + 7;
        
        int[] fact = new int[B+W+1];
        fact[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            fact[i] = (fact[i-1] * i) % mod;
        }
        
        int[] invf = new int[B+W+1];
        invf[B+W] = inved(fact[B+W], mod);
        for (int i = B+W-1; i >= 0; i--) {
            invf[i] = (int)(((long)invf[i+1] * (i+1)) % mod);
        }
        
        int[] bina = new int[B+W+1];
        bina[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            bina[i] = (bina[i-1] * 2) % mod;
        }
        
        int[] invb = new int[B+W+1];
        invb[B+W] = inved(bina[B+W], mod);
        for (int i = B+W-1; i >= 0; i--) {
            invb[i] = (int)(((long)invb[i+1] * 2) % mod);
        }
        
        if (B == W) {
            for (int i = 0; i < B+W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);