System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 100 100

Expected output:
649620280.957660079002380


```
from decimal import Decimal, getcontext
getcontext ( ). prec = 200
n, d, x = map ( Decimal, input ( ). split ( ) )
ans = 0
for i in range ( 1, int ( n ) + 1 ) :
    i = Decimal ( str ( i ) )
    ans += Decimal ( str ( ( int ( n ) - int ( i ) + 1 ) ) ) / Decimal ( str ( i ) ) * ( d + x * Decimal ( str ( int ( n ) * 2 - 1 ) ) / Decimal ( "2" ) )
print ( ans )


```


Answer:
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
        BigDecimal two = BigDecimal.valueOf(2);
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal iBigDecimal = BigDecimal.valueOf(i);
            BigDecimal numerator = BigDecimal.valueOf(n.intValue() - i + 1);
            BigDecimal denominator = iBigDecimal;
            BigDecimal term = numerator.divide(denominator, 200, BigDecimal.ROUND_HALF_UP);
            BigDecimal factor = (d.add(x.multiply(n.multiply(two).subtract(BigDecimal.ONE)).divide(two, 200, BigDecimal.ROUND_HALF_UP)));
            ans = ans.add(term.multiply(factor));
        }
        System.out.println(ans);
    }
}
```

You can run this code with the following test case:

```
1000 100 100
```

The expected output is:

```
649620280.957660079002380
```<|endoftext|>
