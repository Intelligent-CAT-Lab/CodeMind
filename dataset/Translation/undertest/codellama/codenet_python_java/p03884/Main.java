import java.util.Scanner;

public class p03884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int seg = 2**7;
        String OT = "EESSTTIIVVAALL";
        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j + i, i) * 2**j;
            }
            L[i] = K / ci;
            K %= ci;
        }
        String ans = "F".repeat(K) + "ESTIVAL";
        for (int l : L) {
            ans = l + "F" + OT + ans;
        }
        System.out.println(ans);
    }

    public static int comb(int a, int b) {
        if (a < b || b < 0) {
            return 0;
        }
        return frac[a] * fraci[b] * fraci[a - b] % mod;
    }

    public static int[] frac;
    public static int[] fraci;
    public static int mod = 10**18 + 3;

    static {
        frac = new int[1341];
        fraci = new int[1341];
        frac[0] = 1;
        for (int i = 1; i < 1341; i++) {
            frac[i] = i * frac[i - 1] % mod;
        }
        fraci[1340] = pow(frac[1340], mod - 2, mod);
        for (int i = 1339; i >= 0; i--) {
            fraci[i] = fraci[i + 1] * (1341 + i) % mod;
        }
    }
}