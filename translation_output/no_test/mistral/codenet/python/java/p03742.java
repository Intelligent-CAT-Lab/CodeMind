<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = "Alice";
        if (Math.abs(a - b) <= 1) {
            result = "Brown";
        }
        System.out.println(result);
    }
}
```</s>
