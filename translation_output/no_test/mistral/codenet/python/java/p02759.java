<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = (n+1)/2
print(int(a))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (n + 1) / 2;
        System.out.println(a);
    }
}
```</s>
