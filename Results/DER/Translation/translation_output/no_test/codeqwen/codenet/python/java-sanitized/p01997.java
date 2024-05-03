import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class p01997 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        BigDecimal result = new BigDecimal(4.0/3.0 * Math.PI * Math.pow(B, 3)).setScale(10, RoundingMode.HALF_UP);
        System.out.println(result.toPlainString());
    }
}