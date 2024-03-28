<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2919

Expected output:
3719


```
n,r = [int(x) for x in input().split()]

if n < 10:
    print(r + (100 * (10 - n)))
else:
    print(r)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        n = scanner.nextInt();
        r = scanner.nextInt();
        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```</s>
