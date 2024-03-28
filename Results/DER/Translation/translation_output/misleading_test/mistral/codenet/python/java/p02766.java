<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11 2

Expected output:
0

```
n,k = map(int, input().split())
i = 0

while n//k**i != 0:
    i += 1

print(i)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        System.out.println(i);
    }
}
```</s>
