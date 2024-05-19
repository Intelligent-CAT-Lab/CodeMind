System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 3 4

Expected output:
32

```
n,a,b = map(int,input().split())

k = n//(a+b)
p = n%(a+b)

print(k*a + min(p,a))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = n/(a+b);
        int p = n%(a+b);
        int result = k*a + Math.min(p,a);
        System.out.println(result);
    }
}
```

Test input:
```
8 3 4
```

Expected output:
```
32
```<|endoftext|>
