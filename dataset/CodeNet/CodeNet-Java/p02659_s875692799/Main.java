import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal A = BigDecimal.valueOf(sc.nextLong());
        BigDecimal B = BigDecimal.valueOf(sc.nextDouble());

        System.out.println(A.multiply(B).divide(BigDecimal.valueOf(1),0,BigDecimal.ROUND_FLOOR));


    }

}
