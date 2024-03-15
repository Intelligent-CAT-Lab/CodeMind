<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
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
        System.out.println(a + b + c - Math.max(a, b, c));
    }
}
```</s>
