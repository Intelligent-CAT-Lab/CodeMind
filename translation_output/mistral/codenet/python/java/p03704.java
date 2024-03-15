<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
def f(d,x,y):n=int("9"*x+"0"*y);return d==0 if x<1 else sum(f(d+i*n,x-2,y+1)*(10-abs(i)-(y<1))for i in range(-9,10)if abs(d+i*n)<n)
D=input();print sum(f(D,i,0)*(10-i%2*9)for i in range(1,21))
```
[/INST]
```java
public class Main {
    public static int f(int d, int x, int y) {
        int n = (x < 1) ? 0 : (int) (Math.pow(10, x) - Math.pow(10, y));
        return (d == 0) ? 0 : sum(f(d + i * n, x - 2, y + 1) * (10 - abs(i) - (y < 1)) for i in range(-9, 10) if abs(d + i * n) < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        System.out.println(sum(f(D, i, 0) * (10 - i % 2 * 9) for i in range(1, 21)));
    }
}
```</s>
