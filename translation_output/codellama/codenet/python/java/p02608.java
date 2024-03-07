<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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
Note that the Java code uses a `HashMap` to store the counts of each number, and a `Collections.frequency` method to get the count of each number in the `ArrayList`. The `Collections.frequency` method returns the number of times a given element appears in the `ArrayList`.</s>
