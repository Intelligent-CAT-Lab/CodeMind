import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class codeforces_373_B {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] tokens = reader.readLine().split(" ");
            BigInteger w = new BigInteger(tokens[0]);
            BigInteger m = new BigInteger(tokens[1]);
            BigInteger k = new BigInteger(tokens[2]);
            System.out.println(calculateMaxLength(w, m, k));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long calculateMaxLength(BigInteger w, BigInteger m, BigInteger k) {
        BigInteger availableDigits = w.divide(k);
        long maxLength = 0;
        while (availableDigits.compareTo(BigInteger.ZERO) > 0) {
            int currentCostPerN = m.toString().length();
            BigInteger sameCostUntil = BigInteger.TEN.pow(currentCostPerN);
            BigInteger usableNumbers = sameCostUntil.subtract(m);
            BigInteger useDigits = usableNumbers.multiply(BigInteger.valueOf(currentCostPerN));
            m = sameCostUntil;
            if (availableDigits.compareTo(useDigits) >= 0) {
                maxLength += usableNumbers.longValue();
                availableDigits = availableDigits.subtract(useDigits);
            } else {
                maxLength += availableDigits.divide(BigInteger.valueOf(currentCostPerN)).longValue();
                availableDigits = BigInteger.ZERO;
            }
        }
        return maxLength;
    }
}