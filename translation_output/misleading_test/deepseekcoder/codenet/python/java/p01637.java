<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
M r

Expected output:
9277

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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int rd = scanner.nextInt();
        int rr = scanner.nextInt();
        int cd = scanner.nextInt();
        int cr = scanner.nextInt();
        scanner.close();

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) ex++;

        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) ey++;

        int result = m - ex - ey;
        System.out.println(result >= 0 ? result : -1);
    }

    private static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```

This Java code does exactly the same thing as the Python code. It reads five integers from the input, calculates `ex` and `ey`, and then prints the result of `m - ex - ey` if it's non-negative, otherwise it prints `-1`. The function `f` is used to check if `a * b < 100 * c`.
<|EOT|>
