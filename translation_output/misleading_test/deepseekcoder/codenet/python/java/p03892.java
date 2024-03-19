<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int h = Math.abs(b-d);
        int w = Math.abs(c-a);
        if (h==0 || w==0) {
            System.out.println(0);
            return;
        }
        int m = gcd(Math.max(h,w),Math.min(h,w));
        System.out.println(h+w-m);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, calculates the absolute difference between the second and fourth integers (h) and the absolute difference between the third and first integers (w), and then calculates the greatest common divisor (gcd) of h and w. The result is then printed to the console.
<|EOT|>
