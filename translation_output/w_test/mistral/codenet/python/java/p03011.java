<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
4


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
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a + b + c - Math.max(a, b, c);
        System.out.println(result);
    }
}
```</s>
