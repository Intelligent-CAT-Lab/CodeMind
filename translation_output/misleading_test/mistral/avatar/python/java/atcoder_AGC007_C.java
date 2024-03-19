<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int d = Integer.parseInt(split[1]);
        int x = Integer.parseInt(split[2]);
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n; i++) {
            BigDecimal i = new BigDecimal(String.valueOf(i));
            ans = ans.add(new BigDecimal(String.valueOf(n - i + 1)).divide(i, MathContext.DECIMAL128).multiply(new BigDecimal(d + new BigDecimal(String.valueOf(n * 2 - 1)).multiply(new BigDecimal("2")).intValue()))
        }
        System.out.println(ans);
    }
}
```</s>
