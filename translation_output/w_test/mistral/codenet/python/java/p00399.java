<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 1 1

Expected output:
8


```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int g = scanner.nextInt();
        int sum = r + b + w + g;
        System.out.println(sum);
    }
}
```</s>
