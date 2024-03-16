<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A,x,C=input().split()
print("A"+x[0]+"C")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String x = scanner.next();
        String C = scanner.next();
        System.out.println(A + x[0] + C);
    }
}
```</s>
