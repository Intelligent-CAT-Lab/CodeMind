<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N != 100 else 100 ** D * (N + 1))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        int result = (int) Math.pow(100, D) * N;
        if (N != 100) {
            result *= (N + 1);
        }
        System.out.println(result);
    }
}
```</s>
