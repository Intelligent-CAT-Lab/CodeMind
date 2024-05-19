System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
t>z

```
print(input()[:3])
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.substring(0, 3);
        System.out.println(output);
    }
}
```

Test input:
takahashi

Expected output:
t>z<|endoftext|>
