import java.util.*;
import java.math.*;

public class p02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(new BigDecimal(A).multiply(new BigDecimal(B)).toBigInteger());
    }
}