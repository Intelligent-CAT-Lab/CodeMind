<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
260522

Expected output:
31

```
import sys
from collections import defaultdict
K = int ( input ( ) )
cnt = 0
now = 0
if K % 2 == 0 :
    print ( - 1 )
    sys. exit ( 0 )
for i in range ( 10 ** 6 ) :
    cnt += 1
    now = ( now * 10 + 7 ) % K
    if now == 0 :
        print ( cnt )
        sys. exit ( 0 )
print ( - 1 )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int cnt = 0;
        int now = 0;
        if (K % 2 == 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < 1000000; i++) {
            cnt++;
            now = (now * 10 + 7) % K;
            if (now == 0) {
                System.out.println(cnt);
                return;
            }
        }
        System.out.println(-1);
    }
}
```
<|endoftext|>
