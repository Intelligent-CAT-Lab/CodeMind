<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
-6

```
x=int(input())
n=x//11
x=x-11*n
if x==0:
    print(2*n)

elif 1<=x<=6:
    print(1+2*n)
else:
    print(2+2*n)


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x / 11;
        x = x - 11 * n;
        if (x == 0) {
            System.out.println(2 * n);
        } else if (1 <= x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }
    }
}
```</s>
