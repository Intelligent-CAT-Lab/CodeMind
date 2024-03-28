<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        String result = "Brown" + (Math.abs(x - y) <= 1 ? "" : "Alice");
        System.out.println(result);
    }
}
```</s>
