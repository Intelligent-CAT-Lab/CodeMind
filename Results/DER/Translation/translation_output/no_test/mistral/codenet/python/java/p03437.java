<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x,y=map(int,input().split())
print(x if x%y else -1)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = x % y;
        if (result == 0) {
            result = -1;
        }
        System.out.println(result);
    }
}
```</s>
