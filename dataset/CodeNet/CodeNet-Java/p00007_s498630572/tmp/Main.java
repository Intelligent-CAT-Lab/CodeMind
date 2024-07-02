import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigDecimal totalDebt = new BigDecimal(100000);

        // ?¨??????\???
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
System.out.println("[INST]10;term;sc.nextInt();"+term);

        // ?????¨??±????????????????????????
        for (int i = 0; i < term; i++) {

            totalDebt = totalDebt.multiply(BigDecimal.valueOf(1.05)).setScale(-3, BigDecimal.ROUND_UP);
System.out.println("[INST]15;totalDebt;totalDebt.multiply(BigDecimal.valueOf(1.05)).setScale(-3, BigDecimal.ROUND_UP);"+totalDebt);
System.out.println("[INST]15;None;totalDebt.multiply(BigDecimal.valueOf(1.05));"+totalDebt.multiply(BigDecimal.valueOf(1.05)));
System.out.println("[INST]15;None;BigDecimal.valueOf(1.05);"+BigDecimal.valueOf(1.05));
        }

        System.out.println(totalDebt.longValue());

        sc.close();

    }
}