<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def f(a,b,c):
    return a*b<100*c
m,rd,rr,cd,cr=map(int,input().split())
ex=cd*100//rd
if(f(ex,rd,cd)):ex+=1
ey=cr*100//rr
if(f(ey,rr,cr)):ey+=1
print(m-ex-ey if m-ex-ey>=0 else -1)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rd = sc.nextInt();
        int rr = sc.nextInt();
        int cd = sc.nextInt();
        int cr = sc.nextInt();

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex++;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey++;
        }
        int result = m - ex - ey;
        if (result < 0) {
            result = -1;
        }
        System.out.println(result);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `f` function is defined as a static method in the `Solution` class. The rest of the code is similar to the Python code, with the exception of the `f` function being defined as a static method in Java.</s>
