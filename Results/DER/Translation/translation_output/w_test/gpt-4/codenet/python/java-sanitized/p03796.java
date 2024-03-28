import java.util.Scanner;
import java.math.BigInteger;

public class p03796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        BigInteger modulo = new BigInteger("1000000007");
        BigInteger result = factorial.mod(modulo);
        System.out.println(result);
    }
}