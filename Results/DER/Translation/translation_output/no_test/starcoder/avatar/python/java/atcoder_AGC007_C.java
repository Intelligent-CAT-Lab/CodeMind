<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal n = new BigDecimal(sc.next());
        BigDecimal d = new BigDecimal(sc.next());
        BigDecimal x = new BigDecimal(sc.next());
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n.intValue(); i++) {
            ans = ans.add(new BigDecimal(String.valueOf((n.intValue() - i + 1) * d.intValue() / i)).multiply(x.multiply(new BigDecimal(String.valueOf(n.intValue() * 2 - 1))).divide(new BigDecimal("2"))));
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
