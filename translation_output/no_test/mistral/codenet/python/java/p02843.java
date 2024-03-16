<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = N / 100;
        int mod = N % 100;
        System.out.println(mod <= q * 5 ? 1 : 0);
    }
}
```</s>
