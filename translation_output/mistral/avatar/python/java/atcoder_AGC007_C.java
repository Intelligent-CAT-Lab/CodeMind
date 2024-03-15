<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        String nStr = scanner.nextLine();
        int n = Integer.parseInt(nStr);
        System.out.print("Enter d: ");
        String dStr = scanner.nextLine();
        BigDecimal d = new BigDecimal(dStr);
        System.out.print("Enter x: ");
        String xStr = scanner.nextLine();
        BigDecimal x = new BigDecimal(xStr);
        BigDecimal ans = new BigDecimal(0);
        for (int i = 1; i <= n; i++) {
            BigDecimal i = new BigDecimal(String.valueOf(i));
            ans = ans.add(new BigDecimal(String.valueOf(n - i + 1)).divide(i, MathContext.DECIMAL128).multiply(d.add(x.multiply(new BigDecimal(String.valueOf(n * 2 - 1))).divide(new BigDecimal("2"), MathContext.DECIMAL128))));
        }
        System.out.println(ans);
    }
}
```</s>
