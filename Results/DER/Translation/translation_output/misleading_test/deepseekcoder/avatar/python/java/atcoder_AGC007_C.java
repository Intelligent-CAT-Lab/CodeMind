<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 100 100

Expected output:
649620222.6734236

```
from decimal import Decimal , getcontext
getcontext ( ) . prec = 200
n , d , x = map ( Decimal , input ( ) . split ( ) )
ans = 0
for i in range ( 1 , int ( n ) + 1 ) :
    i = Decimal ( str ( i ) )
    ans += Decimal ( str ( ( int ( n ) - int ( i ) + 1 ) ) ) / Decimal ( str ( i ) ) * ( d + x * Decimal ( str ( int ( n ) * 2 - 1 ) ) / Decimal ( "2" ) )
print ( ans )


```

### Response:
Here is the Java version of the Python code:

```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = scanner.nextBigDecimal();
        BigDecimal d = scanner.nextBigDecimal();
        BigDecimal x = scanner.nextBigDecimal();

        BigDecimal ans = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n.add(BigDecimal.ONE)) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal temp = n.subtract(i).add(BigDecimal.ONE);
            ans = ans.add(temp.divide(i, 200, BigDecimal.ROUND_HALF_UP)
                    .multiply(d.add(x.multiply(n.multiply(new BigDecimal("2")).subtract(BigDecimal.ONE)))));
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three `BigDecimal` values from the input, initializes a `BigDecimal` variable `ans` to `0`, and then loops from `1` to `n` (inclusive). In each iteration, it calculates a term and adds it to `ans`. Finally, it prints `ans`.

Please note that the precision of the `BigDecimal` operations is set to 200 digits. This is equivalent to the Python code setting the precision of the `Decimal` context to 200.

Also, please note that the `compareTo` method is used to compare `BigDecimal` values instead of `<` or `>`. This is because `BigDecimal` does not support the `<` or `>` operators.
<|EOT|>
