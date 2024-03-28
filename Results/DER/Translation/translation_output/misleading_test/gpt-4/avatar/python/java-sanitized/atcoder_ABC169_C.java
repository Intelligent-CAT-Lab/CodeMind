import java.math.BigInteger;
import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        String aString = inputs[0];
        String bString = inputs[1].charAt(0) + inputs[1].substring(2);
        
        BigInteger a = new BigInteger(aString);
        BigInteger b = new BigInteger(bString);
        BigInteger hundred = new BigInteger("100");

        BigInteger result = a.multiply(b).divide(hundred);
        System.out.println(result.toString());
    }
}