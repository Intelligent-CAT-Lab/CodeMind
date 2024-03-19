<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
51

```
from math import factorial
MAX = 10**9+7
N, M = map(int, input().split())
diff = N-M
if abs(diff)>1:
    print(0)
elif diff == 0:
    print(factorial(N)*factorial(M)*2%MAX)
else:
    print(factorial(N)*factorial(M)%MAX)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int diff = n-m;
        if(Math.abs(diff)>1)
            System.out.println(0);
        else if(diff==0)
            System.out.println((int)(Math.pow(2,n)*Math.pow(2,m)%1000000007));
        else
            System.out.println((int)(Math.pow(2,n)*Math.pow(2,m-1)%1000000007));
    }
}
```
<|endoftext|>
