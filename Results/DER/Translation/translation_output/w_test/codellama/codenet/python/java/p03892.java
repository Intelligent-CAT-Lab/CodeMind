<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
4


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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int h = Math.abs(b - d);
        int w = Math.abs(c - a);

        if (h == 0 || w == 0) {
            System.out.println(0);
            return;
        }

        int m = gcd(Math.max(h, w), Math.min(h, w));
        System.out.println(h + w - m);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```
This code first prompts the user to enter four integers separated by spaces, and then it calculates the absolute difference between the second and fourth integers, and the third and first integers. It then checks if either of these differences is zero, and if so, it returns 0.

If neither of the differences is zero, it calculates the greatest common divisor (GCD) of the two differences using the `gcd` function, which is defined recursively. The GCD is then subtracted from the sum of the two differences to get the final result.

Finally, the result is printed to the console.</s>
