import java.util.*;
import java.math.*;

public class p02659 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        BigDecimal A = new BigDecimal(input[0]);
        BigDecimal B = new BigDecimal(input[1]);
        System.out.println(A.multiply(B).intValue());
    }
}