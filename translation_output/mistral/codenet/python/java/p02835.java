<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int, input().split())
print('win' if a+b+c<22 else 'bust')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String result = (a + b + c < 22) ? "win" : "bust";
        System.out.println(result);
    }
}
```</s>
