Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathContext mc = new MathContext(200);
        BigDecimal n = new BigDecimal(sc.next(), mc);
        BigDecimal d = new BigDecimal(sc.next(), mc);
        BigDecimal x = new BigDecimal(sc.next(), mc);
        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal i_dec = new BigDecimal(i);
            ans = ans.add(new BigDecimal((int)(n.intValue() - i + 1))
                   .divide(i_dec, mc)
                   .multiply(d.add(x.multiply(new BigDecimal(int.toString(n.multiply(new BigDecimal("2")).subtract(new BigDecimal("1"))))))
                           .divide(new BigDecimal("2"), mc)));
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
