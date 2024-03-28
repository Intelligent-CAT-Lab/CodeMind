import java.util.*;
import java.math.*;

public class p02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        BigDecimal A = new BigDecimal(input[0]);
        BigDecimal B = new BigDecimal(input[1]);
        System.out.println(A.multiply(B).intValue());
    }
}