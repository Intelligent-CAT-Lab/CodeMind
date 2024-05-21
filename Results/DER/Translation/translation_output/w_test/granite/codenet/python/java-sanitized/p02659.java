import java.util.*;
import java.math.BigDecimal;

public class p02659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        BigDecimal c = a.multiply(b);
        System.out.println(c);
    }
}