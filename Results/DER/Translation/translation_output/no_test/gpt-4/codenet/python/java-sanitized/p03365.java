import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p03365 {
    
    private final static BigInteger MOD = BigInteger.valueOf(1000000007);
    private static BigInteger[] fact;
    private static BigInteger[] ifact;

    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : null;
        Reader reader = new Reader(filename);
        try {
            int caseNumber = 1;
            while (reader.hasNext()) {
                System.out.println("Case #" + caseNumber + ": " + solve(reader));
                caseNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BigInteger solve(Reader reader) throws IOException {
        int n = reader.readInt();
        fact = new BigInteger[n + 1];
        ifact = new BigInteger[n + 1];
        
        fact[0] = BigInteger.ONE;
        ifact[0] = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
            ifact[i] = fact[i].modInverse(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        BigInteger c0 = BigInteger.ZERO;
        for (int i = n / 2; i < n; i++) {
            BigInteger c1 = nCk(i - 1, n - 1 - i).multiply(fact[i]).multiply(fact[n - i - 1])
                                    .subtract(c0).add(MOD).mod(MOD);
            ans = ans.add(c