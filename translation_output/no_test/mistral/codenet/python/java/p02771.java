<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if a == b and b != c:
  print("Yes")
elif b == c and a != b:
  print("Yes")
elif a == c and a != b:
  print("Yes")
else:
  print("No")
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
        if (a == b && b != c) {
            System.out.println("Yes");
        } else if (b == c && a != b) {
            System.out.println("Yes");
        } else if (a == c && a != b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
