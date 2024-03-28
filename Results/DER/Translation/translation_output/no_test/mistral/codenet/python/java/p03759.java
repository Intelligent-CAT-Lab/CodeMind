<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if b-a==c-b:
  print('YES')
else:
  print('NO')
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
        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
