<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
erow/

```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String output = "Brown";
        if (Math.abs(x - y) > 1) {
            output = "Alice";
        }
        System.out.println(output);
    }
}
```</s>
