<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
-46

```
n,i=map(int,input().split())
print(n+1-i)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println(n + 1 - i);
    }
}
```</s>
