<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N,M = list(map(int,input().split()))
time = 1900*M+(N-M)*100
print(time*(2**M))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (1 << M));
    }
}
```</s>
