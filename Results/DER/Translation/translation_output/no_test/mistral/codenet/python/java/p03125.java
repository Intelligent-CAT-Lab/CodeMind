<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x,y=map(int,input().split())
if y%x ==0:
  print(x+y)
else:
  print(y-x)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}
```</s>
