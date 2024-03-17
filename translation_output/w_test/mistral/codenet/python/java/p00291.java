<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
0


```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
print(1 if sum >= 1000 else 0)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1 = scanner.nextInt();
        int c5 = scanner.nextInt();
        int c10 = scanner.nextInt();
        int c50 = scanner.nextInt();
        int c100 = scanner.nextInt();
        int c500 = scanner.nextInt();
        int sum = c1 + c5 * 5 + c10 * 10 + c50 * 50 + c100 * 100 + c500 * 500;
        System.out.println(1 == sum >= 1000 ? "0" : "1");
    }
}
```</s>
