<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N,M=map(int,input().split())
print(N*M)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(N * M);
    }
}
```</s>
