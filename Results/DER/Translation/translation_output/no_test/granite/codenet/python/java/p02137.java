System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
print(int(int(input()) // 500 * 500))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = (int) Math.floor(input / 500.0) * 500;
        System.out.println(result);
    }
}
```<|endoftext|>
