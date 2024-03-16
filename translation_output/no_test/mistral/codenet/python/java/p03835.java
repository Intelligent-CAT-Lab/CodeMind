<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, s = scanner.nextInt();
        int result = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (z <= s - y) {
                    result += z;
                }
            }
        }
        System.out.println(result);
    }
}
```</s>
