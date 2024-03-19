import java.util.*;
import java.math.*;

public class p02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = new BigDecimal(sc.next());
        BigDecimal B = new BigDecimal(sc.next());
        System.out.println(A.multiply(B).intValue());
    }
}