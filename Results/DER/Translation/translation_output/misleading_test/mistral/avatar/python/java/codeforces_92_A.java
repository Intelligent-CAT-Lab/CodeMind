<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
24 7440

Expected output:
71

```
import sys
input = sys . stdin . readline
n , m = map ( int , input ( ) . split ( ) )
i = 0
while True :
    if i + 1 > m :
        ans = m
        break
    m -= i + 1
    i += 1
    i %= n
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                int ans = m;
                break;
            }
            m -= i + 1;
            i++;
            i %= n;
        }
        System.out.println(ans);
    }
}
```</s>
