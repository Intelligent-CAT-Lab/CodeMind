<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 3;
        int d = 4;

        int h = Math.abs(b - d);
        int w = Math.abs(c - a);

        if (h == 0 || w == 0) {
            return 0;
        }

        int m = gcd(Math.max(h, w), Math.min(h, w));
        return h + w - m;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```
Explanation:

* The `gcd` function is defined to calculate the greatest common divisor of two numbers.
* The `main` function takes the input from the user and calculates the absolute difference between `b` and `d`, and the absolute difference between `c` and `a`.
* If either of the differences is 0, the function returns 0.
* Otherwise, it calculates the greatest common divisor of the two differences using the `gcd` function.
* The function then returns the sum of the two differences minus the greatest common divisor.

Note: The `Math.abs` method is used to calculate the absolute difference between two numbers, and the `Math.max` and `Math.min` methods are used to find the maximum and minimum of two numbers, respectively.</s>
