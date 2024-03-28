<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
80
-95
-96
67
-43
81
23
81
-71
98
-70
71
-20
63
-52
-70
88
-70
-89
-69

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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> cnt = new ArrayList<>();
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
                    if (a <= n) {
                        cnt.add(a);
                    }
                }
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : cnt) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(map.getOrDefault(i, 0));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the input, then it calculates the sum of the squares of three numbers and the products of two numbers for each combination of these three numbers. If the result is less than or equal to the input number, it adds the result to a list. It then counts the occurrences of each number in the list and prints the counts for each number from 1 to the input number.
<|EOT|>
