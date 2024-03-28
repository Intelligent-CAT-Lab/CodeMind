import java.util.*;
import java.math.*;

public class p02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split(" ");
        String[] B = sc.next().split(" ");
        System.out.println(new BigDecimal(A[0]).multiply(new BigDecimal(B[1])).toBigInteger());
    }
}