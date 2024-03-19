<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> cnt = new ArrayList<>();
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt.add(a);
                    }
                }
            }
        }
        HashMap<Integer, Integer> c = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            c.put(i, Collections.frequency(cnt, i));
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(c.get(i));
        }
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first prompts the user to enter a number `n`, and then it creates an `ArrayList` called `cnt` to store the values of `a` that are less than or equal to `n`. It then uses a `HashMap` called `c` to store the frequency of each value of `a` in `cnt`. Finally, it prints the frequency of each value of `a` in `cnt`.

Note that the `Collections.frequency` method is used to get the frequency of each value of `a` in `cnt`. This method returns the number of times a given value appears in a collection. In this case, the collection is `cnt`, and the value is `i`, which is the current value of `a` being processed.</s>
