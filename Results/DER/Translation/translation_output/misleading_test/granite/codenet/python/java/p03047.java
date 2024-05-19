System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
82

```
N,K = map(int,input().split())

print(N-(K-1))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(N-(K-1));
    }
}
```

Test input:
```
3 2
```

Expected output:
```
82
```<|endoftext|>
