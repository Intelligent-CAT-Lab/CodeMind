<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N,K = map(int,input().split())

print(N-(K-1))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N - (K - 1));
    }
}
```</s>
