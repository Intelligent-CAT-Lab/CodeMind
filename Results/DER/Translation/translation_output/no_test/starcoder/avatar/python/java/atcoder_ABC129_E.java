<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
l = input ( ) [ : : - 1 ]
mod = 10 ** 9 + 7
pows = [ 1 ]
for i in range ( 10 ** 5 + 10 ) :
    pows. append ( ( pows [ - 1 ] * 3 ) % mod )
dp = 1
for i in range ( len ( l ) ) :
    if l [ i ] == '1' :
        dp = ( pows [ i ] + dp * 2 ) % mod
print ( dp )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int mod = 1000000007;
        int[] pows = new int[100001];
        pows[0] = 1;
        for (int i = 1; i < pows.length; i++) {
            pows[i] = (pows[i - 1] * 3) % mod;
        }
        int dp = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                dp = (pows[i] + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}
```
<|endoftext|>
