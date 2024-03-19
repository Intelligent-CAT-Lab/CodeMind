import java.math.BigInteger;
import java.util.Scanner;

public class p03884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int seg = 128;
        String OT = "EESSTTIIVVAALL";
        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += (BigInteger.valueOf(2).pow(j).multiply(BigInteger.valueOf(j + i))).mod(BigInteger.valueOf(1000000007)).intValue();
            }
            L[i] = K / ci;
            K %= ci;
        }
        String ans = "F" + "E" * K + "STIVAL";
        for (int l : L) {
            ans = l * "F" + OT + ans;
        }
        System.out.println(ans);
    }
}