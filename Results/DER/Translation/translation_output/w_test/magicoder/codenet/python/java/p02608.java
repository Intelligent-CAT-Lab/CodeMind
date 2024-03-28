<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0


```
import collections
n=int(input())
cnt=[]
for x in range(1,101):
  for y in range(1,101):
    for z in range(1,101):
      a=x**2+y**2+z**2+x*y+y*z+z*x
      if a<=n:
        cnt.append(a)
c=collections.Counter(cnt)
for i in range(1,n+1):
  print(c[i])
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cnt = new int[n + 1];
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
                    if (a <= n) {
                        cnt[a]++;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(cnt[i]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it calculates the sum of the squares of three numbers (x, y, z) and increments the corresponding element in the array `cnt`. Finally, it prints the elements of `cnt`.<｜end▁of▁sentence｜>
