<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
print(int((n + 1) * n / 2)) 
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n*(n+1)/2);
    }
}
```</s>
