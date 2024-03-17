<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 8

Expected output:
Yes


```
a,b,c = map(int,input().split())
if a<b<c:
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
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
