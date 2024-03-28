import java.util.*;
import java.math.*;

public class p02659 {
    static final BigInteger MOD = BigInteger.valueOf((long) (1e9 + 7));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = new BigDecimal(sc.next());
        BigDecimal B = new BigDecimal(sc.next());
        System.out.println(A.multiply(B).toBigInteger());
    }
}