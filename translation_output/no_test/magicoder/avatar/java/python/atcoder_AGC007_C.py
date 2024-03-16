<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import decimal

def main():
    N = float(input())
    d = float(input())
    x = float(input())

    ans = decimal.Decimal(0.0)

    while N > 0.5:
        adnum = decimal.Decimal(d + x * (N - 0.5))
        ans += adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 1

    print(format(ans, '.20f'))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three floating-point numbers from the standard input, performs the same calculations as in the Java code, and prints the result. The `decimal` module is used to handle floating-point numbers with arbitrary precision. The `format` function is used to format the output to 20 decimal places.<｜end▁of▁sentence｜>
