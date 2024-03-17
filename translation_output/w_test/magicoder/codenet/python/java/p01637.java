<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
M r

Expected output:
9333


```
def f(a,b,c):
    return a*b<100*c
m,rd,rr,cd,cr=map(int,input().split())
ex=cd*100//rd
if(f(ex,rd,cd)):ex+=1
ey=cr*100//rr
if(f(ey,rr,cr)):ey+=1
print(m-ex-ey if m-ex-ey>=0 else -1)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.next();
        int rd = scanner.nextInt();
        int rr = scanner.nextInt();
        int cd = scanner.nextInt();
        int cr = scanner.nextInt();
        scanner.close();

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex += 1;
        }

        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey += 1;
        }

        int result = m - ex - ey;
        System.out.println(result >= 0 ? result : -1);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the values of `ex` and `ey`, and then prints the result. The `f` function is used to check if a certain condition is met.<｜end▁of▁sentence｜>
