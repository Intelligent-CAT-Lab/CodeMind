<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())
print(a%b)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a % b);
    }
}
```</s>
