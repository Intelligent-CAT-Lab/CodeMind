<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
62

```
n = int(input())
print(int((n + 1) * n / 2)) 
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (n + 1) * n / 2;
        System.out.println(result);
    }
}
```</s>
