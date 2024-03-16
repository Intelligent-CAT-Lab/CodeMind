<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        System.out.println(i);
    }
}
```</s>
