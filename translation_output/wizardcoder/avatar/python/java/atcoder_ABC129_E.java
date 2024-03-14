Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int mod = (int) Math.pow(10, 9) + 7;
        List<Integer> pows = new ArrayList<>();
        pows.add(1);
        for (int i = 1; i <= 100000; i++) {
            pows.add((pows.get(i - 1) * 3) % mod);
        }
        int dp = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '1') {
                dp = (pows.get(i) + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}
```<|endoftext|>
