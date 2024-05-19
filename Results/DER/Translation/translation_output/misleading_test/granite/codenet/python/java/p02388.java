System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
12

```
x = int(raw_input())
print x*x*x
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x*x*x);
    }
}
```

Test input:
2

Expected output:
12<|endoftext|>
