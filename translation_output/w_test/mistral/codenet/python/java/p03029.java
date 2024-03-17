<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
3


```
a, p = list(map(int, input().split()))
print((3*a+p)//2)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        int result = (3 * a + p) / 2;
        System.out.println(result);
    }
}
```</s>
