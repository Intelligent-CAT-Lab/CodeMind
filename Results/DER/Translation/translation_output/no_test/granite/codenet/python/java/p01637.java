System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rd = sc.nextInt();
        int rr = sc.nextInt();
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        sc.close();

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex += 1;
        }

        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey += 1;
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
```<|endoftext|>
