<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if a==b:
    print(c)
elif b==c:
    print(a)
else:
    print(b)
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
        if (a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
```</s>
