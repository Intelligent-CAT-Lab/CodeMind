import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        BigDecimal n, d, x, ans = BigDecimal.ZERO;
        Scanner scanner = new Scanner(System.in);

        // Set precision
        BigDecimal.getContext().setPrecision(200);

        // Read input
        String[] inputs = scanner.nextLine().split(" ");
        n = new BigDecimal(inputs[0]);
        d = new BigDecimal(inputs[1]);
        x = new BigDecimal(inputs[2]);

        // Calculate answer
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n.add(BigDecimal.ONE)) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal temp = n.subtract(i.subtract(BigDecimal.ONE));
            ans = ans.add(temp.divide(i, 200, BigDecimal.ROUND_HALF_UP)
                    .multiply(d.add(x.multiply(new BigDecimal(n.multiply(new BigDecimal("2")).subtract(BigDecimal.ONE).toString())))));
        }

        // Print answer
        System.out.println(ans);
    }
}