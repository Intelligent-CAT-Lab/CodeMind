System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
-92

```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n * n * n);
    }
}
```

Test input:
2

Expected output:
-92<|endoftext|>
