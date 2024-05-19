System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
73

```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int even = n * (n-1) / 2;
        int odd = m * (m-1) / 2;
        System.out.println(even + odd);
    }
}
```

Test input:
```
2 1
```

Expected output:
```
73
```<|endoftext|>
