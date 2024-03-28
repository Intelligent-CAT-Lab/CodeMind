<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
-72

```
a,b=map(int,input().split())
c = (a+b)/2
d = int(c)
if c-d>0:
  print(d+1)
else:
  print(d)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a + b) / 2;
        int d = (int) c;
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
    }
}
```</s>
