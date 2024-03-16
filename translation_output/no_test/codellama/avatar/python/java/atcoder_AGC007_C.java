<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

from decimal import Decimal , getcontext
getcontext ( ) . prec = 200
n , d , x = map ( Decimal , input ( ) . split ( ) )
ans = 0
for i in range ( 1 , int ( n ) + 1 ) :
    i = Decimal ( str ( i ) )
    ans += Decimal ( str ( ( int ( n ) - int ( i ) + 1 ) ) ) / Decimal ( str ( i ) ) * ( d + x * Decimal ( str ( int ( n ) * 2 - 1 ) ) / Decimal ( "2" ) )
print ( ans )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        BigDecimal n = new BigDecimal(args[0]);
        BigDecimal d = new BigDecimal(args[1]);
        BigDecimal x = new BigDecimal(args[2]);

        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal i = new BigDecimal(i);
            ans = ans.add(new BigDecimal(n.subtract(i).add(1)).divide(i, MathContext.DECIMAL128).multiply(d.add(x.multiply(new BigDecimal(n.multiply(2).subtract(1)).divide(new BigDecimal("2"), MathContext.DECIMAL128)))));
        }
        System.out.println(ans);
    }
}
```
Note that the `MathContext` class is used to specify the precision of the calculations. In this case, we use `MathContext.DECIMAL128` to specify a precision of 128 digits.

Also, note that the `BigDecimal` class is used to represent the numbers in the calculations, which allows for arbitrary-precision arithmetic.

I hope this helps! Let me know if you have any questions or need further assistance.</s>
