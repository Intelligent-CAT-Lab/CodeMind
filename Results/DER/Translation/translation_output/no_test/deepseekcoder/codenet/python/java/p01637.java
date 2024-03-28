<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

        System.out.println((m - ex - ey) >= 0 ? (m - ex - ey) : -1);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```

This Java code does the same thing as the Python code you provided. It reads five integers from the standard input, calculates `ex` and `ey`, and then prints `m - ex - ey` if this value is non-negative, otherwise it prints `-1`. The function `f` is a helper function that checks if `a * b` is less than `100 * c`.
<|EOT|>
