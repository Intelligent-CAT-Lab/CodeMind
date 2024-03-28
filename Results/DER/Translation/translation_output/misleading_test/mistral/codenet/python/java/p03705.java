<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 6

Expected output:
-5

```
n, a, b = map(int,input().split())

if n >= 2:
    if b >= a:
        print((n-2)*(b-a)+1)
    else:
        print(0)
else:
    if a == b:
        print(1)
    else:
        print(0)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (n >= 2) {
            if (b >= a) {
                System.out.println((n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```</s>
