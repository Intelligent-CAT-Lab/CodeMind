<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Java code:

```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = new BigDecimal(scanner.next());
        BigDecimal d = new BigDecimal(scanner.next());
        BigDecimal x = new BigDecimal(scanner.next());
        BigDecimal ans = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
            ans = ans.add(
                    (n.subtract(i).add(BigDecimal.ONE)).divide(i, 200, BigDecimal.ROUND_HALF_UP)
                            .multiply(d.add(x.multiply(n.multiply(new BigDecimal(2)).subtract(BigDecimal.ONE)).divide(new BigDecimal(2), 200, BigDecimal.ROUND_HALF_UP))));
        }
        System.out.println(ans.setScale(200, BigDecimal.ROUND_HALF_UP));
    }
}
```

This Java code does the same thing as the Python code. It reads three decimal numbers from the standard input, calculates the sum of a series, and prints the result. The precision of the result is set to 200 decimal places.<｜end▁of▁sentence｜>
