System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
615

Expected output:
-71

```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = N / 100;
        int mod = N % 100;
        int result = mod <= q * 5? 1 : 0;
        System.out.println(result);
    }
}
```

Test input:
```
615
```

Expected output:
```
-71
```<|endoftext|>
