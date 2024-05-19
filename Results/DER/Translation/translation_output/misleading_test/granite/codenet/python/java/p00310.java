System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
-57

```
p, m, c = map(int, input().split())
print(p+m+c)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        int result = p + m + c;
        System.out.println(result);
    }
}
```

Test input:
```
10 10 20
```

Expected output:
```
-57
```<|endoftext|>
