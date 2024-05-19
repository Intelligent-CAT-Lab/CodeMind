System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
4VC1!0

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
        String output = "ABC" + input;
        System.out.println(output);
    }
}
```

Test input:
```
100
```

Expected output:
```
ABC100
```<|endoftext|>
