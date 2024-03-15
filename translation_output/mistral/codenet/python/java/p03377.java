<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, x;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
