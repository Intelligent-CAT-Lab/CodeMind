<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5 2 3

Expected output:
Ye

```
h, w, s, t = map(int, input().split())
if h * w % 2 == 1:
  if (s + t) % 2 == 1:
    print("No")
  else:
    print("Yes")
else:
  print("Yes")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        if (h * w % 2 == 1) {
            if ((s + t) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("Yes");
        }
    }
}
```</s>
