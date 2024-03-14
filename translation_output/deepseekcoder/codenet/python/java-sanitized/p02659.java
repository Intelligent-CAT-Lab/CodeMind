import java.util.*;
import java.math.*;

public class p02659 {
    static final int MOD = (int)Math.pow(10, 9) + 7;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String A = in.next();
        String B = in.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        System.out.println(a.multiply(b));
    }
}