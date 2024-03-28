<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
4

```


a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, x;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();

        int d = a - b;
        int n = Math.max(0, (x - b) // d);
        long ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```</s>
