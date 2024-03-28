<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, rd, rr, cd, cr;
        m = sc.nextInt();
        rd = sc.nextInt();
        rr = sc.nextInt();
        cd = sc.nextInt();
        cr = sc.nextInt();
        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex++;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey++;
        }
        System.out.println(m - ex - ey);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```</s>
