<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
-41

```
def gcd(a,b): return b if a%b==0 else gcd(b,a%b)
def main():
    a,b,c,d = map(int,input().split())
    h = abs(b-d)
    w = abs(c-a)
    if h==0 or w==0 : return 0
    m = gcd(max(h,w),min(h,w))
    return h+w-m

print(main())

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int h = Math.abs(b-d);
        int w = Math.abs(c-a);
        if(h==0 || w==0) return 0;
        int m = Math.max(h,w);
        int n = Math.min(h,w);
        while(m%n!=0) {
            int temp = m;
            m = n;
            n = temp%n;
        }
        return h+w-m;
    }
}
```
<|endoftext|>
