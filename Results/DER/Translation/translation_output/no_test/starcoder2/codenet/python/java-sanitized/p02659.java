import java.util.*;
import java.math.*;

public class p02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] AB = sc.nextLine().split(" ");
        BigDecimal A = new BigDecimal(AB[0]);
        BigDecimal B = new BigDecimal(AB[1]);
        System.out.println(A.multiply(B).intValue());
    }
}