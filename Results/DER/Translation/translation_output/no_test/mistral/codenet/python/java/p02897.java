<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
print(-(-N//2)/N)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(-(-N//2)/N);
    }
}
```</s>
