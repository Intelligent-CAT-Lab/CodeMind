import java.util.*;
import java.math.*;

public class p02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.nextLine().split(" ");
        String[] B = sc.nextLine().split(" ");
        BigDecimal a = new BigDecimal(A[0]);
        BigDecimal b = new BigDecimal(B[0]);
        BigDecimal res = a.multiply(b);
        System.out.println(res.toBigInteger());
    }
}