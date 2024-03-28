<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 17

Expected output:
83


```
x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        int result = x - t;
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
```</s>
