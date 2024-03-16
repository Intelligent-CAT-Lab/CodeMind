<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, a, b;
        x = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        String result = (Math.abs(x - a) < Math.abs(x - b)) ? "A" : "B";
        System.out.println(result);
    }
}
```</s>
