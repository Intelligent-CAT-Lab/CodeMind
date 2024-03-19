<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
14

```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (n == 0) ? 0 : (int) (Math.log(n) / Math.log(2)) - 2;
        System.out.println(result);
    }
}
```</s>
