import java.math.BigDecimal;
import java.math.RoundingMode;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        BigDecimal n = new BigDecimal(input[0]);
        BigDecimal d = new BigDecimal(input[1]);
        BigDecimal x = new BigDecimal(input[2]);
        BigDecimal ans = new BigDecimal("0");
        BigDecimal two = new BigDecimal("2");
        BigDecimal twoNMinusOne = n.multiply(new BigDecimal("2")).subtract(new BigDecimal("1"));
        for (BigDecimal i = new BigDecimal("1"); i.compareTo(n.add(new BigDecimal("1"))) < 0; i = i.add(new BigDecimal("1"))) {
            ans = ans.add(n.subtract(i).add(new BigDecimal("1")).divide(i, 200, RoundingMode.HALF_UP).multiply(d.add(x.multiply(twoNMinusOne).divide(two, 200, RoundingMode.HALF_UP))));
        }
        System.out.println(ans);
    }
}