System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int result = (int) Math.floor(A * Math.min(B - 1, N) / (double) B);
        System.out.println(result);
    }
}
```

Test input:
```
5 7 4
```

Expected output:
```
2
```<|endoftext|>
