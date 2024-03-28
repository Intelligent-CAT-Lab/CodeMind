<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int h = Math.abs(b - d);
        int w = Math.abs(c - a);
        if (h == 0 || w == 0) {
            System.out.println(0);
            return;
        }
        int m = gcd(Math.max(h, w), Math.min(h, w));
        System.out.println(h + w - m);
    }
}
```

This Java code does the same thing as the Python code. It calculates the greatest common divisor (gcd) of two numbers using the Euclidean algorithm, and then subtracts the gcd from the sum of the absolute differences of the coordinates.<｜end▁of▁sentence｜>
