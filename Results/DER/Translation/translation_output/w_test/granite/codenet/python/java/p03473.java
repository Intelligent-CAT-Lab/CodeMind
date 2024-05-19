System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
21

Expected output:
27


```
M = int(input())
print(48-M)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        System.out.println(48 - M);
    }
}
```

Test input:
21

Expected output:
27<|endoftext|>
