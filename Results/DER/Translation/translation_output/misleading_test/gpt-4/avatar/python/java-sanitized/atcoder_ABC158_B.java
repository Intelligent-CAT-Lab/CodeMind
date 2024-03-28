import java.math.BigInteger;
import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = new BigInteger(scanner.next());
        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());

        BigInteger sumAB = A.add(B);
        BigInteger ans = N.divide(sumAB).multiply(A);
        BigInteger rem = N.mod(sumAB);
        ans = ans.add(rem.min(A));

        System.out.println(ans.toString());
    }
}