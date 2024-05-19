System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
ABC100


```
s = str(input())
print("ABC"+s)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("ABC" + input);
    }
}
```

Test input:
100

Expected output:
ABC100<|endoftext|>
