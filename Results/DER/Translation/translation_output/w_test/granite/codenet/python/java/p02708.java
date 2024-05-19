System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
10


```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += ((((2 * n - i + 1) * i) / 2) - ((i * (i - 1)) / 2) + 1) % (100000007);
        }
        System.out.println(ans);
    }
}
```

You can test the code with the following test case:

```
3 2
```

The expected output is:

```
10
```<|endoftext|>
