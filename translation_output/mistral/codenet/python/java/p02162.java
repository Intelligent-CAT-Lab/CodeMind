<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
t1,t2,r1,r2 = map(int,input().split())
if r1 == -1 or r2 == -1:
    if t1 < t2:
        print('Alice')
    elif t1 > t2:
        print('Bob')
    else:
        print('Draw')
elif r1 > r2:
    print('Alice')
elif r1 < r2:
    print('Bob')
else:
    print('Draw')

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1, t2, r1, r2;
        t1 = scanner.nextInt();
        t2 = scanner.nextInt();
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        if (r1 == -1 || r2 == -1) {
            if (t1 < t2) {
                System.out.println("Alice");
            } else if (t1 > t2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        } else if (r1 > r2) {
            System.out.println("Alice");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```</s>
