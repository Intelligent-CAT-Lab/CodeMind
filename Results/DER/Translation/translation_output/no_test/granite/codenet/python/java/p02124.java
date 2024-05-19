System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
print("ai1333" + "3" * int(int(input()) / 100))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input / 100;
        String output = "ai1333" + String.valueOf(result);
        System.out.println(output);
    }
}
```<|endoftext|>
