<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import decimal

def solve():
    N, d, x = map(decimal.Decimal, input().split())

    ans = decimal.Decimal(0.0)
    decimal.getcontext().prec = 100

    while N > decimal.Decimal(0.5):
        adnum = d + x * (N - decimal.Decimal(0.5))
        ans += adnum
        d = (N + decimal.Decimal(1.0)) * d / N + decimal.Decimal(5.0) * x / (decimal.Decimal(2.0) * N)
        x = (decimal.Decimal(1.0) + decimal.Decimal(2.0) / N) * x
        N -= decimal.Decimal(1.0)

    print(format(ans, '.20f'))

solve()
```

This Python code does the same thing as the Java code. It reads three decimal numbers from the input, calculates the sum of the geometric progression, and prints the result with 20 decimal places. The `decimal` module is used to handle arbitrary precision arithmetic.
<|EOT|>
