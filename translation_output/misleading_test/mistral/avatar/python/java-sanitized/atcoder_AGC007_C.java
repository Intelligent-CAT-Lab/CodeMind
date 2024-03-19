import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int d = Integer.parseInt(split[1]);
        int x = Integer.parseInt(split[2]);
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n; i++) {
            BigDecimal i = new BigDecimal(String.valueOf(i));
            ans = ans.add(new BigDecimal(String.valueOf(n - i + 1)).divide(i, MathContext.DECIMAL128).multiply(new BigDecimal(d + new BigDecimal(String.valueOf(n * 2 - 1)).multiply(new BigDecimal("2")).intValue()))
        }
        System.out.println(ans);
    }
}