<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n.add(BigDecimal.ONE)) <= 0; i = i.add(BigDecimal.ONE)) {
            ans = ans.add(new BigDecimal(n.subtract(i).add(BigDecimal.ONE).toString()).divide(i, 200, BigDecimal.ROUND_HALF_UP)
                    .multiply(d.add(x.multiply(new BigDecimal(n.multiply(new BigDecimal(2)).subtract(BigDecimal.ONE).toString()).divide(new BigDecimal("2"), 200, BigDecimal.ROUND_HALF_UP)))));
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three decimal numbers from the standard input, calculates a sum, and prints the result. The precision of the calculations is set to 200 decimal places.<｜end▁of▁sentence｜>
