<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3266

```
a,b=map(int,input().split())
if a<=b:
    print(str(a)*b)
else:
    print(str(b)*a)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= b) {
            System.out.println(a * b);
        } else {
            System.out.println(b * a);
        }
    }
}
```</s>
