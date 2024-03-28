<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, d;
        n = scanner.nextInt();
        d = scanner.nextInt();
        System.out.println(-(-n/(2*d+1)));
    }
}
```</s>
