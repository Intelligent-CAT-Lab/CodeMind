<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 100 100

Expected output:
649620280.95766068078000000000


```
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double N = scan.nextDouble();
        double d = scan.nextDouble();
        double x = scan.nextDouble();

        BigDecimal ans = new BigDecimal("0.0");

        while (N > 0.5) {
            BigDecimal adnum = BigDecimal.valueOf(d + x * (N - 0.5));
            ans = ans.add(adnum);
            d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N);
            x = (1.0 + (2.0 / N)) * x;
            --N;
        }

        DecimalFormat format = new DecimalFormat("#.0");
        format.setMinimumFractionDigits(20);
        System.out.println(format.format(ans));
    }
}
```
[/INST]
```python
import sys
from decimal import Decimal, getcontext

def main():
    N, d, x = map(float, input().split())
    ans = Decimal("0.0")

    while N > 0.5:
        adnum = Decimal(d + x * (N - 0.5))
        ans += adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 0.5

    format = "{:.20f}".format
    print(format(ans))

if __name__ == "__main__":
    main()
```</s>
