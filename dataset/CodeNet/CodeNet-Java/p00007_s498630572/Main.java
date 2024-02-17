import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigDecimal totalDebt = new BigDecimal(100000);

        // ?¨??????\???
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();

        // ?????¨??±????????????????????????
        for (int i = 0; i < term; i++) {

            totalDebt = totalDebt.multiply(BigDecimal.valueOf(1.05)).setScale(-3, BigDecimal.ROUND_UP);
        }

        System.out.println(totalDebt.longValue());

        sc.close();

    }
}