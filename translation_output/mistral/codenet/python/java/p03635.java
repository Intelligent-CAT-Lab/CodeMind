<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n, m = map(int, input().split())
print((n-1)*(m-1))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```</s>
