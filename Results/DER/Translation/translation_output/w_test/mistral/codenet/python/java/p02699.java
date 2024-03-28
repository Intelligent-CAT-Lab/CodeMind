<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5

Expected output:
unsafe


```
s, w = map(int, input().split())

if w >= s :
    print("unsafe")
else:
    print("safe")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int w = scanner.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```</s>
