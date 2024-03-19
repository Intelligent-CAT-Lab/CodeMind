<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5

Expected output:
ossible

```
# ABC067 A - Sharing Cookies
a,b = map(int,input().split())

if a%3 == 0:
    print('Possible')
elif b%3 == 0:
    print('Possible')
elif (a+b)%3 == 0:
    print('Possible')
else:
    print('Impossible')
```
[/INST]
```java
import java.util.Scanner;

public class SharingCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 3 == 0) {
            System.out.println("Possible");
        } else if (b % 3 == 0) {
            System.out.println("Possible");
        } else if ((a + b) % 3 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
```</s>
