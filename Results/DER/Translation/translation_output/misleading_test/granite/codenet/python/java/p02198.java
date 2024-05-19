System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
-8

```
N,M=map(int,input().split())
print(N*M)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(N * M);
    }
}
```

Test input:
```
3 4
```

Expected output:
```
-8
```<|endoftext|>
