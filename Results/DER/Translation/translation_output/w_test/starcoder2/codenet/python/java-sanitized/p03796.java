import java.util.Scanner;
import java.math.BigInteger;

public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact.mod(BigInteger.valueOf(1000000007)));
    }
}