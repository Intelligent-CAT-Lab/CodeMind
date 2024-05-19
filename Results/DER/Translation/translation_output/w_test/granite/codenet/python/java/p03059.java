System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
10


```
a, b, t = map(int, input().split())
print((t // a) * b)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int result = (t / a) * b;
        System.out.println(result);
    }
}
```

Test input:
```
3 5 7
```

Expected output:
```
10
```<|endoftext|>
