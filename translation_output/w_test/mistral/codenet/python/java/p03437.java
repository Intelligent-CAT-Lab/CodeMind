<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
16


```
x,y=map(int,input().split())
print(x if x%y else -1)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = x;
        if (x % y == 0) {
            result = -1;
        }
        System.out.println(result);
    }
}
```</s>
