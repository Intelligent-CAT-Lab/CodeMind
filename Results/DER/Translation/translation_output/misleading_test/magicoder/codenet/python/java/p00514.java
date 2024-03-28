<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 0 3

Expected output:
94

```
n,m,r=map(int,input().split())
a,b=sorted([n-1,r-m*n])
d=1
for i in range(a):d*=i+1
u=1
for i in range(b,a+b):u*=i+1
print(0 if a<1 else u//d)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();

        int[] arr = {n - 1, r - m * n};
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];

        long d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }

        long u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }

        System.out.println(a < 1 ? 0 : u / d);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, sorts them, and then calculates the factorial of the smaller number and the factorial of the difference between the larger number and the smaller number. The result is then printed to the standard output.<｜end▁of▁sentence｜>
