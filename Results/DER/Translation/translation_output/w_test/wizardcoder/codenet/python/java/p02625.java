Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


```
n,m=map(int,input().split())
d=[1]*(n+1)
for i in range(n):
  d[i+1]=((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(10**9+7)
print(d[-1])

```

### Response:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[n+1];
        d[0] = 1;
        for(int i=1;i<=n;i++){
            d[i] = ((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%1000000007;
        }
        System.out.println(d[n]);
    }
}
```<|endoftext|>
