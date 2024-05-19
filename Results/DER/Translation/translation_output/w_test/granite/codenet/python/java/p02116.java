System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
n = int(input())
print((n+1) &- (n+1))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (n+1) &- (n+1);
        System.out.println(result);
    }
}
```

Test input:
2

Expected output:
1<|endoftext|>
