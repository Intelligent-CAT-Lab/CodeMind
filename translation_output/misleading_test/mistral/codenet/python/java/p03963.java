<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
13

```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = k * (k - 1) * (n - 1);
        System.out.println(result);
    }
}
```</s>
