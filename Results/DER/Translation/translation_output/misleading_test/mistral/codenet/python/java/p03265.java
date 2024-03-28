<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 0 1

Expected output:
-24 64 -99 -38

```
a,s,d,f=map(int,input().split())
x3=d-f+s
y3=f+d-a
x4=a-f+s
y4=s+d-a
print(x3,y3,x4,y4)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();

        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```</s>
