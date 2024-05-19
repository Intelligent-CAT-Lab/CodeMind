System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
-1

```
n, m = map(int, input().split())
print((n-1)*(m-1))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```

You can run this code with the following test case:

```
3 4
```

Expected output:
```
-1
```<|endoftext|>
