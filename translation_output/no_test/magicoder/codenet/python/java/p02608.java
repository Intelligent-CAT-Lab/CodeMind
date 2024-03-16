<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
                    if (a <= n) {
                        cnt.put(a, cnt.getOrDefault(a, 0) + 1);
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(cnt.getOrDefault(i, 0));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then it calculates the sum of the squares of `x`, `y`, and `z`, and the products of `x`, `y`, and `z`, and then it checks if the result is less than or equal to `n`. If it is, it increments the count of that result in the `cnt` map. Finally, it prints the count of each number from 1 to `n`.<｜end▁of▁sentence｜>
