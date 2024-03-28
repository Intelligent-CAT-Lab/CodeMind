<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 16

Expected output:
-45

```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int x = (int) Math.pow(A, 2) - (int) Math.pow(B, 2) / (2 * (A - B));
        if (x % 1 == 0) {
            System.out.println(x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```</s>
