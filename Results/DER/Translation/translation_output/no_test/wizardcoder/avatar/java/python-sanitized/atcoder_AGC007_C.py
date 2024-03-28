import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Scanner

class atcoder_AGC007_C:
    def main(self):
        scan = Scanner(System.in)
        N = scan.nextDouble()
        d = scan.nextDouble()
        x = scan.nextDouble()

        ans = BigDecimal("0.0")

        while N > 0.5:
            adnum = BigDecimal.valueOf(d + x * (N - 0.5))
            ans = ans.add(adnum)
            d = (N +