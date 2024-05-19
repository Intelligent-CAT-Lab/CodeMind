System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
0


```
print(1 - int(input()))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = 1 - input;
        System.out.println(result);
    }
}
```

Test input:
1

Expected output:
0<|endoftext|>
