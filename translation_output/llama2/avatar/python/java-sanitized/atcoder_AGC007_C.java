Solution


import java.util.Scanner;
import java.math.BigDecimal;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n; i++) {
            BigDecimal i = new BigDecimal(String.valueOf(i));
            ans = ans.add(new BigDecimal(String.valueOf(n - i + 1))).divide(i).multiply(new BigDecimal(String.valueOf(d + x * new BigDecimal(String.valueOf(n * 2 - 1)) / new BigDecimal("2"))));
        }
        System.out.println(ans);
    }
}