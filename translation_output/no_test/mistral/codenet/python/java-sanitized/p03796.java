import java.math.BigInteger;
import java.util.Scanner;

public class p03796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger result = BigInteger.valueOf(n).factorial();
        result = result.mod(BigInteger.valueOf(1000000007));
        System.out.println(result);
    }
}