<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

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
        Map<Integer, Integer> c = Collections.frequency(cnt);
        for (int i = 1; i <= n; i++) {
            System.out.println(c.get(i));
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the values of `cnt`. The `Collections.frequency` method is used to count the frequency of each value in the `cnt` list. Finally, the `Map` class is used to store the frequency of each value in the `cnt` list, and the `System.out.println` method is used to print the frequency of each value.</s>
