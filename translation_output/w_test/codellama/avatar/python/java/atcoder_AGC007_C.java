<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 100 100

Expected output:
649620280.957660079002380


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
[/INST]
```java
import java.math.BigDecimal;
import java.math.MathContext;

public class Solution {
    public static void main(String[] args) {
        BigDecimal n = new BigDecimal(args[0]);
        BigDecimal d = new BigDecimal(args[1]);
        BigDecimal x = new BigDecimal(args[2]);
        BigDecimal ans = BigDecimal.ZERO;

        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal iDecimal = new BigDecimal(String.valueOf(i));
            ans = ans.add(new BigDecimal(String.valueOf(n.intValue() - i + 1)).divide(iDecimal, MathContext.DECIMAL128).multiply(d.add(x.multiply(new BigDecimal(String.valueOf(n.intValue() * 2 - 1)).divide(new BigDecimal("2"), MathContext.DECIMAL128)))));
        }

        System.out.println(ans);
    }
}
```
Note: The `MathContext.DECIMAL128` is used to specify the precision of the calculations. You can change it to a different value if you need more or less precision.</s>
