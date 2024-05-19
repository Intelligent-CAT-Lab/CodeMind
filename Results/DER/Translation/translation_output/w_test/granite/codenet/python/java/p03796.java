System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            result %= 1000000007;
        }
        System.out.println(result);
    }
}
```

Test input:
```
3
```

Expected output:
```
6
```<|endoftext|>
