<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### Solution

```java
import java.util.Scanner;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n; i++) {
            BigDecimal i = new BigDecimal(String.valueOf(i));
            ans = ans.add(new BigDecimal(String.valueOf(n - i + 1))).divide(i).multiply(new BigDecimal(String.valueOf(d + x * new BigDecimal(String.valueOf(n * 2 - 1)) / new BigDecimal("2"))));
        }
        System.out.println(ans);
    }
}
```
</s>
