import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal A = BigDecimal.valueOf(sc.nextLong());
System.out.println("[INST]11;A;BigDecimal.valueOf(sc.nextLong());"+A);
System.out.println("[INST]11;None;sc.nextLong();"+sc.nextLong());
        BigDecimal B = BigDecimal.valueOf(sc.nextDouble());
System.out.println("[INST]12;B;BigDecimal.valueOf(sc.nextDouble());"+B);
System.out.println("[INST]12;None;sc.nextDouble();"+sc.nextDouble());

        System.out.println(A.multiply(B).divide(BigDecimal.valueOf(1),0,BigDecimal.ROUND_FLOOR));


    }

}
