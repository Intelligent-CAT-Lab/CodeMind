<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigDecimal n, d, x, ans = BigDecimal.ZERO;
        Scanner scanner = new Scanner(System.in);

        // Set precision
        BigDecimal.getContext().setPrecision(200);

        // Read input
        String[] inputs = scanner.nextLine().split(" ");
        n = new BigDecimal(inputs[0]);
        d = new BigDecimal(inputs[1]);
        x = new BigDecimal(inputs[2]);

        // Calculate answer
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n.add(BigDecimal.ONE)) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal temp = n.subtract(i.subtract(BigDecimal.ONE));
            ans = ans.add(temp.divide(i, 200, BigDecimal.ROUND_HALF_UP)
                    .multiply(d.add(x.multiply(new BigDecimal(n.multiply(new BigDecimal("2")).subtract(BigDecimal.ONE).toString())))));
        }

        // Print answer
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three `BigDecimal` numbers from the standard input, calculates the sum of a series, and prints the result. The precision of the `BigDecimal` operations is set to 200.
<|EOT|>
