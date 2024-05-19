System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import decimal

N, d, x = map(decimal.Decimal, input().split())
ans = decimal.Decimal(0.0)

while N > decimal.Decimal(0.5):
    adnum = d + x * (N - decimal.Decimal(0.5))
    ans += adnum
    d = (N + decimal.Decimal(1.0)) * d / N + (decimal.Decimal(5.0) * x) / (decimal.Decimal(2.0) * N)
    x = (decimal.Decimal(1.0) + (decimal.Decimal(2.0) / N)) * x
    N -= decimal.Decimal(1.0)

print(ans)
```<|endoftext|>
