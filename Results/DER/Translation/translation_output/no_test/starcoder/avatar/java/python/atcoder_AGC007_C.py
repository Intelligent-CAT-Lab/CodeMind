<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

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
            d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
            x = (1.0 + (2.0 / N)) * x
            N -= 1

        format = DecimalFormat("#.0")
        format.setMinimumFractionDigits(20)
        System.out.println(format.format(ans))

if __name__ == "__main__":
    atcoder_AGC007_C().main()
```
"""
<|endoftext|>
