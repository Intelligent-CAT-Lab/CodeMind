import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathContext mc = new MathContext(200); // Set precision to 200

        String[] input = scanner.nextLine().split(" ");
        BigDecimal n = new BigDecimal(input[0], mc);
        BigDecimal d = new BigDecimal(input[1], mc);
        BigDecimal x = new BigDecimal(input[2], mc);

        BigDecimal ans = BigDecimal.ZERO;
        BigDecimal two = new BigDecimal("2", mc);
        
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal bi = new BigDecimal(Integer.toString(i), mc);
            BigDecimal term1 = n.subtract(bi).add(BigDecimal.ONE);
            BigDecimal term2 = term