<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
ABC


```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```</s>
