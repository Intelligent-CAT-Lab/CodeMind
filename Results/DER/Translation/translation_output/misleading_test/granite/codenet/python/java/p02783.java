System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 4

Expected output:
88

```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```


Answer:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int result = (int) Math.ceil((double) H / A);
        System.out.println(result);
    }
}
```

Test input:
```
10 4
```

Expected output:
```
3
```<|endoftext|>
