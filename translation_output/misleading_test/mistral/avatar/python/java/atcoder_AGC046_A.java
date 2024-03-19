<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
435

```
X = int ( input ( ) )
i = 1
a = 0
while True :
    a = a + X
    if a % 360 == 0 :
        print ( i )
        break
    i += 1


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int a = 0;
        int i = 1;
        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
```</s>
