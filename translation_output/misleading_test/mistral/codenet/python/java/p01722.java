<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
73

```
n=int(input())
print(1if n==0else 2//n)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = n == 0 ? 1 : 2 / n;
        System.out.println(result);
    }
}
```</s>
