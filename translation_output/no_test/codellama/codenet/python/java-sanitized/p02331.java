import java.util.Scanner;
import java.math.BigInteger;

public class p02331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger result = BigInteger.valueOf(k).pow(n);
        System.out.println(result.mod(BigInteger.valueOf(1000000007)));
    }
}