<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import math
x = int(input())
k = 0
t = 0

if (math.sqrt(8 * x + 1) == math.floor(math.sqrt(8 * x + 1))):
  a = (-1 + math.sqrt(1 + 8 * x))/2
  print(int(a))
else:
  x = (-1 + math.sqrt(1 + 8 * x))//2
  print(int(x) + 1)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            x = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) x + 1);
        }
    }
}
```</s>
