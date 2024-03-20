import java.math.BigInteger;
import java.util.Scanner;

public class p02654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        sc.close();

        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger[] factorials = new BigInteger[n + 1];
        factorials[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        BigInteger[] finvs = new BigInteger[n + 1];
        finvs[n] = factorials[n].modInverse(MOD);
        for (int i = n - 1; i >= 0; i--) {
            finvs[i] = finvs[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }

        BigInteger[] invs = new BigInteger[n + 1];
        invs[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            invs[i] = invs[i - 1].multiply(factorials[i]).mod(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        for (int l = 0; l < a; l++) {
            BigInteger tmp1 = factorials[a].multiply(finvs[l]).mod(MOD).multiply(finvs[a - l]).mod(MOD);
            BigInteger tmp2 = factorials[n - l - 1].multiply(BigInteger.valueOf(a - l)).mod(MOD);
            ans = ans.add(tmp