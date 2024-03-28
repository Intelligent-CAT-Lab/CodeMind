<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
N = int(input())
ans = 0
x = 1
while 2*x-1 <= N:
    x = 2*x
    ans += 1
print(ans)


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int x = 1;
        while (2 * x - 1 <= N) {
            x = 2 * x;
            ans++;
        }
        System.out.println(ans);
    }
}
```</s>
