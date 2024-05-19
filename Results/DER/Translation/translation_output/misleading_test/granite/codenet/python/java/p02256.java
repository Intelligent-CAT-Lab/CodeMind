System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54 20

Expected output:
62

```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y!= 0:
  x, y = y, x % y
print(y)

```


Answer:
```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (x % y!= 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(y);
    }
}
```

Test input:
54 20

Expected output:
6<|endoftext|>
