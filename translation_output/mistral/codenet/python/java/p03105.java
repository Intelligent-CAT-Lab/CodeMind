<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if a*c<b:
    print(c)
else:
    print(b//a)
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
        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```</s>
