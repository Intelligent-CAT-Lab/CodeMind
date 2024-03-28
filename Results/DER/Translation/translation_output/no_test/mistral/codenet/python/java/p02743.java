<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            if (4 * a * b < (c - a - b) ** 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```</s>
