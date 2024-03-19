<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 100 100

Expected output:
649620206.028769

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
import math

def main():
    N, d, x = map(float, input().split())
    ans = 0
    while N > 0.5:
        ans += (d + x * (N - 0.5))
        d = (N + 1) * d / N + (5 * x) / (2 * N)
        x = (1 + (2 / N)) * x
        N -= 1
    print(ans)

if __name__ == '__main__':
    main()
```

'''
<|endoftext|>
